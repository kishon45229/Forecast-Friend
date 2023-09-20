package View;

import java.awt.Frame;
import java.awt.Image;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.util.Calendar;
import java.util.Locale;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import org.json.JSONArray;
import org.json.JSONObject;

public class UserDashboard extends javax.swing.JFrame {
    String email = null;
    
    public UserDashboard() {
        initComponents();
    }
    
    public void updateWeatherData(String city, String email) {
        this.email = email;
        
        String temperature = null;
        String feelslikeTemperature = null;
        String weekdayName = null;
        String currentTime = null;
        Image scaledImage = null;
        String greeting = null;
        String humidity = null;
        String windSpeed = null;
        String visibility = null;
        String pressure = null;
        String uv = null;
        String sunriseTime = null;
        String sunsetTime = null;
        String[] upcomingDates = new String[5];
        String[] upcomingDateIcons = new String[5];
        Image[] upcomingScaledImages = new Image[5];
        String[] upcomingTemperature = new String[5];
        String[] upcomingWeatherCondition = new String[5];
        String apiKey = "ba2170d56aab48d8ac550146231909";
        
        if (city != null) {
            try {
                String encodedCity = java.net.URLEncoder.encode(city, "UTF-8");
                String apiUrl = "http://api.weatherapi.com/v1/forecast.json?key=" + apiKey + "&q=" + encodedCity + "&days=5";
        
                try {
                    // Create a URL object and open a connection
                    URL url = new URL(apiUrl);
                    HttpURLConnection connection = (HttpURLConnection) url.openConnection();
                    connection.setRequestMethod("GET");

                    int responseCode = connection.getResponseCode();
                    System.out.println("Response Code: " + responseCode);

                    String responseMessage = connection.getResponseMessage();
                    System.out.println("Response Message: " + responseMessage);

                    if (responseCode == HttpURLConnection.HTTP_OK) {
                        // Read the API response
                        BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
                        String inputLine;
                        StringBuilder response = new StringBuilder();

                        while ((inputLine = in.readLine()) != null) {
                            response.append(inputLine);
                        }
                        in.close();

                        String jsonResponse = response.toString();
                        JSONObject jsonResponseObj = new JSONObject(jsonResponse);
                        JSONObject current = jsonResponseObj.getJSONObject("current");
                        
                        // Extract weather information from JSON response
                        int temperatureInt = current.getInt("temp_c");
                        int feelslikeTemperatureInt = current.getInt("feelslike_c");
                        
                        String condition = current.getJSONObject("condition").getString("text");
                        String iconUrl = "https:" + current.getJSONObject("condition").getString("icon");
                        int iconCode = current.getJSONObject("condition").getInt("code");
                        
                        int humidityInt = current.getInt("humidity");
                        int windSpeedInt = current.getInt("wind_kph");
                        int visibilityInt = current.getInt("vis_km");
                        int pressureInt = current.getInt("pressure_mb");
                        int uvInt = current.getInt("uv");
                        
                        // Extract sunrise and sunset time
                        JSONArray forecastArray = jsonResponseObj.getJSONObject("forecast").getJSONArray("forecastday");
                        JSONObject astro = forecastArray.getJSONObject(0).getJSONObject("astro");
                        sunriseTime = astro.getString("sunrise");
                        sunsetTime = astro.getString("sunset");
                  
                        temperature = Integer.toString(temperatureInt);
                        feelslikeTemperature = Integer.toString(feelslikeTemperatureInt);
                        
                        humidity = Integer.toString(humidityInt);
                        windSpeed = Integer.toString(windSpeedInt);
                        visibility = Integer.toString(visibilityInt);
                        pressure = Integer.toString(pressureInt);
                        uv = Integer.toString(uvInt);
                                     
                        LocalDateTime objLocalDateTime = LocalDateTime.now();
                        DayOfWeek objDayOfWeek = objLocalDateTime.getDayOfWeek();
                        weekdayName = objDayOfWeek.getDisplayName(TextStyle.FULL, Locale.getDefault());
                        
                        LocalTime objLocalTime = LocalTime.now();
                        DateTimeFormatter objDateTimeFormatter = DateTimeFormatter.ofPattern("hh:mm a");
                        currentTime = objLocalTime.format(objDateTimeFormatter); 
                       
                        URL imageUrl = new URL(iconUrl);
                        Image objImage = ImageIO.read(imageUrl);
                        
                        int iconWidth = 64;
                        int iconHeight = 64;
                        scaledImage = objImage.getScaledInstance(iconWidth, iconHeight, Image.SCALE_SMOOTH);
                    
                        Calendar calendar = Calendar.getInstance();
                        int hour = calendar.get(Calendar.HOUR_OF_DAY); 
                        
                        if (hour >= 5 && hour < 12) {
                            greeting = "Happy morning!";
                            System.out.println("Good morning!");
                        } 
                        else if (hour >= 12 && hour < 15) {
                            greeting = "Good afternoon!";
                        } 
                        else {
                            greeting = "Good evening!";
                        }
                        
                        LocalDate currentDate = LocalDate.now();
                        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EEE d", Locale.ENGLISH);
                        
                        for (int i = 0; i < 5; i++) {
                            currentDate = currentDate.plusDays(1);
                            upcomingDates[i] = currentDate.format(formatter);
                            
                            JSONObject jsonResponse1 = new JSONObject(response.toString());

                            JSONObject forecast = jsonResponse1.getJSONObject("forecast");
                            JSONArray forecastday = forecast.getJSONArray("forecastday");
                            JSONObject nextForecastDay = forecastday.getJSONObject(i);
                            //upcomingDateIcons[i] = "https:" + nextForecastDay.getJSONObject("day").getJSONObject("condition").getString("icon");
                            
                            // Get temperature and weather condition
                            JSONObject dayData = nextForecastDay.getJSONObject("day");
                            int dayTemperature = dayData.getInt("avgtemp_c"); // Replace with the actual key for temperature
                            String dayCondition = dayData.getJSONObject("condition").getString("text"); // Replace with the actual key for condition

                            upcomingDateIcons[i] = "https:" + dayData.getJSONObject("condition").getString("icon");
                            upcomingTemperature[i] = Integer.toString(dayTemperature); // Convert temperature to string and store it
                            upcomingWeatherCondition[i] = dayCondition; // Store the weather condition
                            
                            URL upcomingImageUrl = new URL(upcomingDateIcons[i]);
                            Image objUpcomingImage = ImageIO.read(upcomingImageUrl);
                            upcomingScaledImages[i] = objUpcomingImage.getScaledInstance(iconWidth, iconHeight, Image.SCALE_SMOOTH);   
                        }
                        
                        jLocationSearchField.setText(city);
                        jLocation.setText(city);
                        jWeatherCondition.setText(condition);
                        jTemperature.setText(temperature + " °c");
                        jTemperatureFeelslike.setText(feelslikeTemperature + "°c");
                        jWeekdayName.setText(weekdayName);
                        jCurrentTime.setText(currentTime);
                        jWeatherConditionImage.setIcon(new ImageIcon(scaledImage));
                        jGreetingText.setText(greeting);
                        jHumidity.setText(humidity + "%");
                        jWindSpeed.setText(windSpeed + "kph");
                        jVisibility.setText(visibility + "km");
                        jPressure.setText(pressure + "mp");
                        jUV.setText(uv);
                        jSunrise.setText(sunriseTime);
                        jSunset.setText(sunsetTime);
                        jDay1.setText(upcomingDates[0]);
                        jDay2.setText(upcomingDates[1]);
                        jDay3.setText(upcomingDates[2]);
                        jDay4.setText(upcomingDates[3]);
                        jImageDay1.setIcon(new ImageIcon(upcomingScaledImages[0]));
                        jImageDay2.setIcon(new ImageIcon(upcomingScaledImages[1]));
                        jImageDay3.setIcon(new ImageIcon(upcomingScaledImages[2]));
                        jImageDay4.setIcon(new ImageIcon(upcomingScaledImages[3]));
                        jTemperatureDay1.setText(upcomingTemperature[0] + "°c");
                        jTemperatureDay2.setText(upcomingTemperature[1] + "°c");
                        jTemperatureDay3.setText(upcomingTemperature[2] + "°c");
                        jTemperatureDay4.setText(upcomingTemperature[3] + "°c");
                        jConditionDay1.setText(upcomingWeatherCondition[0]);
                        jConditionDay2.setText(upcomingWeatherCondition[1]);
                        jConditionDay3.setText(upcomingWeatherCondition[2]);
                        jConditionDay4.setText(upcomingWeatherCondition[3]);
                    }
                    else {
                        System.out.println("Failed");
                    }
                }
                catch (Exception e) {
                    e.printStackTrace();
                }
            } 
            catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            }
        } 
        else {
            JFrame NewJFrame = this;
            NewJFrame.dispose();
            
            Login objLogin = new Login();
            objLogin.setVisible(true);
        } 
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLeftPanel = new javax.swing.JPanel();
        jLocationSearchField = new javax.swing.JTextField();
        jSearchButton = new javax.swing.JButton();
        jWeatherCondition = new javax.swing.JLabel();
        jWeatherConditionImage = new javax.swing.JLabel();
        jTemperature = new javax.swing.JLabel();
        jWeekdayName = new javax.swing.JLabel();
        jCurrentTime = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jTemperatureFeelslike = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLocation = new javax.swing.JLabel();
        jChangeCityButton = new javax.swing.JLabel();
        jMainPanel = new javax.swing.JPanel();
        jHumidityPanel = new javax.swing.JPanel();
        jHumidityPanelHead = new javax.swing.JLabel();
        jHumidity = new javax.swing.JLabel();
        jWindPanel = new javax.swing.JPanel();
        jWindPanelHead = new javax.swing.JLabel();
        jWindSpeed = new javax.swing.JLabel();
        jVisibilityPanel = new javax.swing.JPanel();
        jVisibilityPanelHead = new javax.swing.JLabel();
        jVisibility = new javax.swing.JLabel();
        jPressurePanel = new javax.swing.JPanel();
        jPressurePanelHead = new javax.swing.JLabel();
        jPressure = new javax.swing.JLabel();
        jUVPanel = new javax.swing.JPanel();
        jUVHead = new javax.swing.JLabel();
        jUV = new javax.swing.JLabel();
        jSunriseSunsetPanel = new javax.swing.JPanel();
        jSunrise = new javax.swing.JLabel();
        jSunriseHead = new javax.swing.JLabel();
        jSunset = new javax.swing.JLabel();
        jSunsetHead = new javax.swing.JLabel();
        jDay1Panel = new javax.swing.JPanel();
        jDay1 = new javax.swing.JLabel();
        jImageDay1 = new javax.swing.JLabel();
        jTemperatureDay1 = new javax.swing.JLabel();
        jConditionDay1 = new javax.swing.JLabel();
        jDay2Panel = new javax.swing.JPanel();
        jDay2 = new javax.swing.JLabel();
        jImageDay2 = new javax.swing.JLabel();
        jTemperatureDay2 = new javax.swing.JLabel();
        jConditionDay2 = new javax.swing.JLabel();
        jDay3Panel = new javax.swing.JPanel();
        jDay3 = new javax.swing.JLabel();
        jImageDay3 = new javax.swing.JLabel();
        jTemperatureDay3 = new javax.swing.JLabel();
        jConditionDay3 = new javax.swing.JLabel();
        jDay4Panel = new javax.swing.JPanel();
        jDay4 = new javax.swing.JLabel();
        jImageDay4 = new javax.swing.JLabel();
        jTemperatureDay4 = new javax.swing.JLabel();
        jConditionDay4 = new javax.swing.JLabel();
        jGreetingText = new javax.swing.JLabel();
        jMinimizeButton = new javax.swing.JLabel();
        jCloseButton = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jLeftPanel.setBackground(new java.awt.Color(255, 255, 255));
        jLeftPanel.setPreferredSize(new java.awt.Dimension(250, 600));
        jLeftPanel.setLayout(null);

        jLocationSearchField.setFont(new java.awt.Font("SF UI Display", 0, 14)); // NOI18N
        jLocationSearchField.setMinimumSize(new java.awt.Dimension(64, 23));
        jLeftPanel.add(jLocationSearchField);
        jLocationSearchField.setBounds(20, 130, 140, 24);

        jSearchButton.setFont(new java.awt.Font("SF UI Display", 0, 14)); // NOI18N
        jSearchButton.setText("Search");
        jSearchButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jSearchButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jSearchButton.setFocusPainted(false);
        jLeftPanel.add(jSearchButton);
        jSearchButton.setBounds(170, 130, 70, 23);

        jWeatherCondition.setFont(new java.awt.Font("SF UI Display", 0, 24)); // NOI18N
        jWeatherCondition.setText("Partly cloudy");
        jLeftPanel.add(jWeatherCondition);
        jWeatherCondition.setBounds(20, 260, 220, 28);

        jWeatherConditionImage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLeftPanel.add(jWeatherConditionImage);
        jWeatherConditionImage.setBounds(160, 300, 73, 62);

        jTemperature.setFont(new java.awt.Font("SF UI  Text SemBd", 1, 48)); // NOI18N
        jTemperature.setText("28°c");
        jLeftPanel.add(jTemperature);
        jTemperature.setBounds(20, 300, 125, 70);

        jWeekdayName.setFont(new java.awt.Font("SF UI  Text", 0, 36)); // NOI18N
        jWeekdayName.setText("Monday");
        jLeftPanel.add(jWeekdayName);
        jWeekdayName.setBounds(20, 390, 230, 44);

        jCurrentTime.setFont(new java.awt.Font("SF UI  Text", 0, 18)); // NOI18N
        jCurrentTime.setText("09:00 PM");
        jLeftPanel.add(jCurrentTime);
        jCurrentTime.setBounds(20, 430, 85, 30);

        jLabel1.setFont(new java.awt.Font("SF UI  Text", 0, 14)); // NOI18N
        jLabel1.setText("Feels like");
        jLeftPanel.add(jLabel1);
        jLabel1.setBounds(20, 490, 67, 18);

        jTemperatureFeelslike.setFont(new java.awt.Font("SF UI  Text", 0, 24)); // NOI18N
        jTemperatureFeelslike.setText("26°c");
        jLeftPanel.add(jTemperatureFeelslike);
        jTemperatureFeelslike.setBounds(20, 510, 70, 29);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 85)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("F");
        jLeftPanel.add(jLabel2);
        jLabel2.setBounds(30, 10, 70, 100);

        jLabel3.setFont(new java.awt.Font("SF UI Display", 1, 36)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel3.setText("orecast");
        jLeftPanel.add(jLabel3);
        jLabel3.setBounds(90, 20, 150, 50);

        jLabel4.setFont(new java.awt.Font("SF UI Display", 0, 36)); // NOI18N
        jLabel4.setText("riend");
        jLeftPanel.add(jLabel4);
        jLabel4.setBounds(90, 60, 79, 44);

        jLabel5.setFont(new java.awt.Font("SF UI  Text", 0, 12)); // NOI18N
        jLabel5.setText("Your city");
        jLeftPanel.add(jLabel5);
        jLabel5.setBounds(20, 170, 230, 20);

        jLocation.setFont(new java.awt.Font("SF UI  Text", 0, 24)); // NOI18N
        jLocation.setText("Batticaloa");
        jLeftPanel.add(jLocation);
        jLocation.setBounds(20, 190, 220, 30);

        jChangeCityButton.setText("<html><u><font color=\"blue\"><html><u><font color=\"blue\">Change your cities</font></u></html> ");
        jChangeCityButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jChangeCityButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jChangeCityButtonMouseClicked(evt);
            }
        });
        jLeftPanel.add(jChangeCityButton);
        jChangeCityButton.setBounds(20, 216, 150, 30);

        jMainPanel.setBackground(new java.awt.Color(153, 153, 255));
        jMainPanel.setPreferredSize(new java.awt.Dimension(550, 600));
        jMainPanel.setLayout(null);

        jHumidityPanel.setBackground(new java.awt.Color(255, 255, 255));
        jHumidityPanel.setPreferredSize(new java.awt.Dimension(150, 100));

        jHumidityPanelHead.setFont(new java.awt.Font("SF UI  Text", 0, 14)); // NOI18N
        jHumidityPanelHead.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jHumidityPanelHead.setText("Humidity");

        jHumidity.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jHumidity.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jHumidity.setText("85%");

        javax.swing.GroupLayout jHumidityPanelLayout = new javax.swing.GroupLayout(jHumidityPanel);
        jHumidityPanel.setLayout(jHumidityPanelLayout);
        jHumidityPanelLayout.setHorizontalGroup(
            jHumidityPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jHumidity, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jHumidityPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jHumidityPanelHead, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jHumidityPanelLayout.setVerticalGroup(
            jHumidityPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jHumidityPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jHumidityPanelHead)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jHumidity)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jMainPanel.add(jHumidityPanel);
        jHumidityPanel.setBounds(40, 70, 150, 113);

        jWindPanel.setBackground(new java.awt.Color(255, 255, 255));
        jWindPanel.setPreferredSize(new java.awt.Dimension(150, 100));

        jWindPanelHead.setFont(new java.awt.Font("SF UI  Text", 0, 14)); // NOI18N
        jWindPanelHead.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jWindPanelHead.setText("Wind");

        jWindSpeed.setFont(new java.awt.Font("SF UI  Text", 0, 36)); // NOI18N
        jWindSpeed.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jWindSpeed.setText("14kph");

        javax.swing.GroupLayout jWindPanelLayout = new javax.swing.GroupLayout(jWindPanel);
        jWindPanel.setLayout(jWindPanelLayout);
        jWindPanelLayout.setHorizontalGroup(
            jWindPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jWindPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jWindPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jWindPanelHead, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jWindSpeed, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE))
                .addContainerGap())
        );
        jWindPanelLayout.setVerticalGroup(
            jWindPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jWindPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jWindPanelHead)
                .addGap(18, 18, 18)
                .addComponent(jWindSpeed)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jMainPanel.add(jWindPanel);
        jWindPanel.setBounds(220, 70, 150, 113);

        jVisibilityPanel.setBackground(new java.awt.Color(255, 255, 255));
        jVisibilityPanel.setPreferredSize(new java.awt.Dimension(150, 100));

        jVisibilityPanelHead.setFont(new java.awt.Font("SF UI  Text", 0, 14)); // NOI18N
        jVisibilityPanelHead.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jVisibilityPanelHead.setText("Visibility");

        jVisibility.setFont(new java.awt.Font("SF UI  Text", 0, 36)); // NOI18N
        jVisibility.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jVisibility.setText("9Km");

        javax.swing.GroupLayout jVisibilityPanelLayout = new javax.swing.GroupLayout(jVisibilityPanel);
        jVisibilityPanel.setLayout(jVisibilityPanelLayout);
        jVisibilityPanelLayout.setHorizontalGroup(
            jVisibilityPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jVisibilityPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jVisibilityPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jVisibilityPanelHead, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jVisibility, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE))
                .addContainerGap())
        );
        jVisibilityPanelLayout.setVerticalGroup(
            jVisibilityPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jVisibilityPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jVisibilityPanelHead)
                .addGap(18, 18, 18)
                .addComponent(jVisibility)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        jMainPanel.add(jVisibilityPanel);
        jVisibilityPanel.setBounds(410, 70, 150, 113);

        jPressurePanel.setBackground(new java.awt.Color(255, 255, 255));
        jPressurePanel.setPreferredSize(new java.awt.Dimension(150, 100));

        jPressurePanelHead.setFont(new java.awt.Font("SF UI  Text", 0, 14)); // NOI18N
        jPressurePanelHead.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPressurePanelHead.setText("Pressure");

        jPressure.setFont(new java.awt.Font("SF UI  Text", 0, 32)); // NOI18N
        jPressure.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPressure.setText("1012mb");

        javax.swing.GroupLayout jPressurePanelLayout = new javax.swing.GroupLayout(jPressurePanel);
        jPressurePanel.setLayout(jPressurePanelLayout);
        jPressurePanelLayout.setHorizontalGroup(
            jPressurePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPressurePanelHead, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPressurePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPressure, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPressurePanelLayout.setVerticalGroup(
            jPressurePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPressurePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPressurePanelHead)
                .addGap(18, 18, 18)
                .addComponent(jPressure)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        jMainPanel.add(jPressurePanel);
        jPressurePanel.setBounds(40, 200, 150, 113);

        jUVPanel.setBackground(new java.awt.Color(255, 255, 255));

        jUVHead.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jUVHead.setText("UV ");

        jUV.setFont(new java.awt.Font("SF UI  Text", 0, 36)); // NOI18N
        jUV.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jUV.setText("10");

        javax.swing.GroupLayout jUVPanelLayout = new javax.swing.GroupLayout(jUVPanel);
        jUVPanel.setLayout(jUVPanelLayout);
        jUVPanelLayout.setHorizontalGroup(
            jUVPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jUVHead, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jUVPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jUV, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jUVPanelLayout.setVerticalGroup(
            jUVPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jUVPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jUVHead)
                .addGap(18, 18, 18)
                .addComponent(jUV)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jMainPanel.add(jUVPanel);
        jUVPanel.setBounds(220, 200, 150, 113);

        jSunriseSunsetPanel.setBackground(new java.awt.Color(255, 255, 255));

        jSunrise.setFont(new java.awt.Font("SF UI  Text", 0, 18)); // NOI18N
        jSunrise.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jSunrise.setText("06:00 AM");

        jSunriseHead.setFont(new java.awt.Font("SF UI  Text", 0, 14)); // NOI18N
        jSunriseHead.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jSunriseHead.setText("Sunrise");

        jSunset.setFont(new java.awt.Font("SF UI  Text", 0, 18)); // NOI18N
        jSunset.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jSunset.setText("06:00 PM");

        jSunsetHead.setFont(new java.awt.Font("SF UI  Text", 0, 14)); // NOI18N
        jSunsetHead.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jSunsetHead.setText("Sunset");

        javax.swing.GroupLayout jSunriseSunsetPanelLayout = new javax.swing.GroupLayout(jSunriseSunsetPanel);
        jSunriseSunsetPanel.setLayout(jSunriseSunsetPanelLayout);
        jSunriseSunsetPanelLayout.setHorizontalGroup(
            jSunriseSunsetPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jSunriseSunsetPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jSunriseSunsetPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSunriseHead, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSunset, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSunsetHead, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSunrise, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE))
                .addContainerGap())
        );
        jSunriseSunsetPanelLayout.setVerticalGroup(
            jSunriseSunsetPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jSunriseSunsetPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSunriseHead)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jSunrise)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSunsetHead)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSunset)
                .addGap(27, 27, 27))
        );

        jMainPanel.add(jSunriseSunsetPanel);
        jSunriseSunsetPanel.setBounds(410, 200, 150, 113);

        jDay1Panel.setBackground(new java.awt.Color(255, 255, 255));

        jDay1.setFont(new java.awt.Font("SF UI  Text", 0, 15)); // NOI18N
        jDay1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jDay1.setText("SUN 1");

        jImageDay1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jTemperatureDay1.setFont(new java.awt.Font("SF UI  Text", 0, 26)); // NOI18N
        jTemperatureDay1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jTemperatureDay1.setText("20°c");
        jTemperatureDay1.setToolTipText("");

        jConditionDay1.setFont(new java.awt.Font("SF UI  Text", 0, 11)); // NOI18N
        jConditionDay1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jConditionDay1.setText("Rain");

        javax.swing.GroupLayout jDay1PanelLayout = new javax.swing.GroupLayout(jDay1Panel);
        jDay1Panel.setLayout(jDay1PanelLayout);
        jDay1PanelLayout.setHorizontalGroup(
            jDay1PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDay1PanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jDay1PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTemperatureDay1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE)
                    .addComponent(jDay1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jImageDay1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addComponent(jConditionDay1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jDay1PanelLayout.setVerticalGroup(
            jDay1PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDay1PanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jDay1)
                .addGap(18, 18, 18)
                .addComponent(jTemperatureDay1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jImageDay1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jConditionDay1, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
                .addGap(12, 12, 12))
        );

        jMainPanel.add(jDay1Panel);
        jDay1Panel.setBounds(40, 360, 120, 210);

        jDay2Panel.setBackground(new java.awt.Color(255, 255, 255));

        jDay2.setFont(new java.awt.Font("SF UI  Text", 0, 15)); // NOI18N
        jDay2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jDay2.setText("MON 2");

        jImageDay2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jTemperatureDay2.setFont(new java.awt.Font("SF UI  Text", 0, 26)); // NOI18N
        jTemperatureDay2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jTemperatureDay2.setText("20°c");
        jTemperatureDay2.setToolTipText("");

        jConditionDay2.setFont(new java.awt.Font("SF UI  Text", 0, 11)); // NOI18N
        jConditionDay2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jConditionDay2.setText("Rain");
        jConditionDay2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jDay2PanelLayout = new javax.swing.GroupLayout(jDay2Panel);
        jDay2Panel.setLayout(jDay2PanelLayout);
        jDay2PanelLayout.setHorizontalGroup(
            jDay2PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDay2PanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jDay2PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jDay2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jImageDay2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTemperatureDay2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE)
                    .addComponent(jConditionDay2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jDay2PanelLayout.setVerticalGroup(
            jDay2PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDay2PanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jDay2)
                .addGap(18, 18, 18)
                .addComponent(jTemperatureDay2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jImageDay2, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jConditionDay2, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                .addGap(14, 14, 14))
        );

        jMainPanel.add(jDay2Panel);
        jDay2Panel.setBounds(170, 360, 120, 210);

        jDay3Panel.setBackground(new java.awt.Color(255, 255, 255));

        jDay3.setFont(new java.awt.Font("SF UI  Text", 0, 15)); // NOI18N
        jDay3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jDay3.setText("TUE 3");

        jImageDay3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jTemperatureDay3.setFont(new java.awt.Font("SF UI  Text", 0, 26)); // NOI18N
        jTemperatureDay3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jTemperatureDay3.setText("20°c");
        jTemperatureDay3.setToolTipText("");

        jConditionDay3.setFont(new java.awt.Font("SF UI  Text", 0, 11)); // NOI18N
        jConditionDay3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jConditionDay3.setText("Rain");

        javax.swing.GroupLayout jDay3PanelLayout = new javax.swing.GroupLayout(jDay3Panel);
        jDay3Panel.setLayout(jDay3PanelLayout);
        jDay3PanelLayout.setHorizontalGroup(
            jDay3PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDay3PanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jDay3PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jDay3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jImageDay3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTemperatureDay3, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE)
                    .addComponent(jConditionDay3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jDay3PanelLayout.setVerticalGroup(
            jDay3PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDay3PanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jDay3)
                .addGap(18, 18, 18)
                .addComponent(jTemperatureDay3)
                .addGap(5, 5, 5)
                .addComponent(jImageDay3, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jConditionDay3, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                .addGap(12, 12, 12))
        );

        jMainPanel.add(jDay3Panel);
        jDay3Panel.setBounds(300, 360, 120, 210);

        jDay4Panel.setBackground(new java.awt.Color(255, 255, 255));
        jDay4Panel.setPreferredSize(new java.awt.Dimension(114, 64));

        jDay4.setFont(new java.awt.Font("SF UI  Text", 0, 15)); // NOI18N
        jDay4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jDay4.setText("WED 4");

        jImageDay4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jTemperatureDay4.setFont(new java.awt.Font("SF UI  Text", 0, 26)); // NOI18N
        jTemperatureDay4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jTemperatureDay4.setText("20°c");
        jTemperatureDay4.setToolTipText("");

        jConditionDay4.setFont(new java.awt.Font("SF UI  Text", 0, 11)); // NOI18N
        jConditionDay4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jConditionDay4.setText("Rain");

        javax.swing.GroupLayout jDay4PanelLayout = new javax.swing.GroupLayout(jDay4Panel);
        jDay4Panel.setLayout(jDay4PanelLayout);
        jDay4PanelLayout.setHorizontalGroup(
            jDay4PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDay4PanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jDay4PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jDay4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jImageDay4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTemperatureDay4, javax.swing.GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE)
                    .addComponent(jConditionDay4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jDay4PanelLayout.setVerticalGroup(
            jDay4PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDay4PanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jDay4)
                .addGap(18, 18, 18)
                .addComponent(jTemperatureDay4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jImageDay4, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jConditionDay4, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                .addGap(11, 11, 11))
        );

        jMainPanel.add(jDay4Panel);
        jDay4Panel.setBounds(430, 360, 130, 210);

        jGreetingText.setFont(new java.awt.Font("SF UI  Text", 0, 24)); // NOI18N
        jGreetingText.setText("Happy morning!");
        jMainPanel.add(jGreetingText);
        jGreetingText.setBounds(40, 10, 240, 40);

        jMinimizeButton.setFont(new java.awt.Font("SF UI Display", 1, 24)); // NOI18N
        jMinimizeButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jMinimizeButton.setText("-");
        jMinimizeButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMinimizeButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMinimizeButtonMouseClicked(evt);
            }
        });
        jMainPanel.add(jMinimizeButton);
        jMinimizeButton.setBounds(540, 10, 30, 20);

        jCloseButton.setFont(new java.awt.Font("SF UI Display", 1, 18)); // NOI18N
        jCloseButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jCloseButton.setText("X");
        jCloseButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jCloseButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jCloseButtonMouseClicked(evt);
            }
        });
        jMainPanel.add(jCloseButton);
        jCloseButton.setBounds(570, 10, 20, 23);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLeftPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jMainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLeftPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jMainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jMinimizeButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMinimizeButtonMouseClicked
        setState(Frame.ICONIFIED);
    }//GEN-LAST:event_jMinimizeButtonMouseClicked

    private void jCloseButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCloseButtonMouseClicked
        int confirmed = JOptionPane.showConfirmDialog(this,
            "Are you sure you want to exit?", "Confirm Exit",
            JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);

        if (confirmed == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }//GEN-LAST:event_jCloseButtonMouseClicked

    private void jChangeCityButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jChangeCityButtonMouseClicked
        final JFrame UserDashboard = this;
        UserDashboard.dispose();
        
        ChangeCity objChangeCity = new ChangeCity();
        objChangeCity.getEmail(email); 
        objChangeCity.setVisible(true);
    }//GEN-LAST:event_jChangeCityButtonMouseClicked

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UserDashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jChangeCityButton;
    private javax.swing.JLabel jCloseButton;
    private javax.swing.JLabel jConditionDay1;
    private javax.swing.JLabel jConditionDay2;
    private javax.swing.JLabel jConditionDay3;
    private javax.swing.JLabel jConditionDay4;
    private javax.swing.JLabel jCurrentTime;
    private javax.swing.JLabel jDay1;
    private javax.swing.JPanel jDay1Panel;
    private javax.swing.JLabel jDay2;
    private javax.swing.JPanel jDay2Panel;
    private javax.swing.JLabel jDay3;
    private javax.swing.JPanel jDay3Panel;
    private javax.swing.JLabel jDay4;
    private javax.swing.JPanel jDay4Panel;
    private javax.swing.JLabel jGreetingText;
    private javax.swing.JLabel jHumidity;
    private javax.swing.JPanel jHumidityPanel;
    private javax.swing.JLabel jHumidityPanelHead;
    private javax.swing.JLabel jImageDay1;
    private javax.swing.JLabel jImageDay2;
    private javax.swing.JLabel jImageDay3;
    private javax.swing.JLabel jImageDay4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jLeftPanel;
    private javax.swing.JLabel jLocation;
    private javax.swing.JTextField jLocationSearchField;
    private javax.swing.JPanel jMainPanel;
    private javax.swing.JLabel jMinimizeButton;
    private javax.swing.JLabel jPressure;
    private javax.swing.JPanel jPressurePanel;
    private javax.swing.JLabel jPressurePanelHead;
    private javax.swing.JButton jSearchButton;
    private javax.swing.JLabel jSunrise;
    private javax.swing.JLabel jSunriseHead;
    private javax.swing.JPanel jSunriseSunsetPanel;
    private javax.swing.JLabel jSunset;
    private javax.swing.JLabel jSunsetHead;
    private javax.swing.JLabel jTemperature;
    private javax.swing.JLabel jTemperatureDay1;
    private javax.swing.JLabel jTemperatureDay2;
    private javax.swing.JLabel jTemperatureDay3;
    private javax.swing.JLabel jTemperatureDay4;
    private javax.swing.JLabel jTemperatureFeelslike;
    private javax.swing.JLabel jUV;
    private javax.swing.JLabel jUVHead;
    private javax.swing.JPanel jUVPanel;
    private javax.swing.JLabel jVisibility;
    private javax.swing.JPanel jVisibilityPanel;
    private javax.swing.JLabel jVisibilityPanelHead;
    private javax.swing.JLabel jWeatherCondition;
    private javax.swing.JLabel jWeatherConditionImage;
    private javax.swing.JLabel jWeekdayName;
    private javax.swing.JPanel jWindPanel;
    private javax.swing.JLabel jWindPanelHead;
    private javax.swing.JLabel jWindSpeed;
    // End of variables declaration//GEN-END:variables
}
