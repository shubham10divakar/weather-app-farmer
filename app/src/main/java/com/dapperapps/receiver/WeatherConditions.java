package com.dapperapps.receiver;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Objects;

/**
 * Created by usman on 4/17/17.
 */

public class WeatherConditions {

    public static HashMap<String, String> mHmWeatherInfo = new HashMap<String, String>() {{
        put("Mostly Cloudy | Mostly Cloudy with Haze | Mostly Cloudy and Breezy |","bkn.jpg");
        put("Fair | Clear | Fair with Haze | Clear with Haze | Fair and Breezy | Clear and Breezy |","skc.jpg");
        put("A Few Clouds | A Few Clouds with Haze | A Few Clouds and Breezy |","few.jpg");
        put("Partly Cloudy | Partly Cloudy with Haze | Partly Cloudy and Breezy |","sct.jpg");
        put("Overcast | Overcast with Haze | Overcast and Breezy |","ovc.jpg");
        put("Fog/Mist | Fog | Freezing Fog | Shallow Fog | Partial Fog | Patches of Fog | Fog in Vicinity | Freezing Fog in Vicinity | Shallow Fog in Vicinity | Partial Fog in Vicinity | Patches of Fog in Vicinity | Showers in Vicinity Fog | Light Freezing Fog | Heavy Freezing Fog |","fg.jpg");
        put("Smoke |","smoke.jpg");
        put("Freezing Rain | Freezing Drizzle | Light Freezing Rain | Light Freezing Drizzle | Heavy Freezing Rain | Heavy Freezing Drizzle | Freezing Rain in Vicinity | Freezing Drizzle in Vicinity |","fzra.jpg");
        put("Ice Pellets | Light Ice Pellets | Heavy Ice Pellets | Ice Pellets in Vicinity | Showers Ice Pellets | Thunderstorm Ice Pellets | Ice Crystals | Hail | Small Hail/Snow Pellets | Light Small Hail/Snow Pellets | Heavy small Hail/Snow Pellets | Showers Hail | Hail Showers |","ip.jpg");
        put("Freezing Rain Snow | Light Freezing Rain Snow | Heavy Freezing Rain Snow | Freezing Drizzle Snow | Light Freezing Drizzle Snow | Heavy Freezing Drizzle Snow | Snow Freezing Rain | Light Snow Freezing Rain | Heavy Snow Freezing Rain | Snow Freezing Drizzle | Light Snow Freezing Drizzle | Heavy Snow Freezing Drizzle |","mix.jpg");
        put("Rain Ice Pellets | Light Rain Ice Pellets | Heavy Rain Ice Pellets | Drizzle Ice Pellets | Light Drizzle Ice Pellets | Heavy Drizzle Ice Pellets | Ice Pellets Rain | Light Ice Pellets Rain | Heavy Ice Pellets Rain | Ice Pellets Drizzle | Light Ice Pellets Drizzle | Heavy Ice Pellets Drizzle |","raip.jpg");
        put("Rain Snow | Light Rain Snow | Heavy Rain Snow | Snow Rain | Light Snow Rain | Heavy Snow Rain | Drizzle Snow | Light Drizzle Snow | Heavy Drizzle Snow | Snow Drizzle | Light Snow Drizzle | Heavy Drizzle Snow |","rasn.jpg");
        put("Rain Showers | Light Rain Showers | Light Rain and Breezy | Heavy Rain Showers | Rain Showers in Vicinity | Light Showers Rain | Heavy Showers Rain | Showers Rain | Showers Rain in Vicinity | Rain Showers Fog/Mist | Light Rain Showers Fog/Mist | Heavy Rain Showers Fog/Mist | Rain Showers in Vicinity Fog/Mist | Light Showers Rain Fog/Mist | Heavy Showers Rain Fog/Mist | Showers Rain Fog/Mist | Showers Rain in Vicinity Fog/Mist |","shra.jpg");
        put("Thunderstorm | Thunderstorm Rain | Light Thunderstorm Rain | Heavy Thunderstorm Rain | Thunderstorm Rain Fog/Mist | Light Thunderstorm Rain Fog/Mist | Heavy Thunderstorm Rain Fog and Windy | Heavy Thunderstorm Rain Fog/Mist | Thunderstorm Showers in Vicinity | Light Thunderstorm Rain Haze | Heavy Thunderstorm Rain Haze | Thunderstorm Fog | Light Thunderstorm Rain Fog | Heavy Thunderstorm Rain Fog | Thunderstorm Light Rain | Thunderstorm Heavy Rain | Thunderstorm Rain Fog/Mist | Thunderstorm Light Rain Fog/Mist | Thunderstorm Heavy Rain Fog/Mist | Thunderstorm in Vicinity Fog/Mist | Thunderstorm Showers in Vicinity | Thunderstorm in Vicinity Haze | Thunderstorm Haze in Vicinity | Thunderstorm Light Rain Haze | Thunderstorm Heavy Rain Haze | Thunderstorm Fog | Thunderstorm Light Rain Fog | Thunderstorm Heavy Rain Fog | Thunderstorm Hail | Light Thunderstorm Rain Hail | Heavy Thunderstorm Rain Hail | Thunderstorm Rain Hail Fog/Mist | Light Thunderstorm Rain Hail Fog/Mist | Heavy Thunderstorm Rain Hail Fog/Hail | Thunderstorm Showers in Vicinity Hail | Light Thunderstorm Rain Hail Haze | Heavy Thunderstorm Rain Hail Haze | Thunderstorm Hail Fog | Light Thunderstorm Rain Hail Fog | Heavy Thunderstorm Rain Hail Fog | Thunderstorm Light Rain Hail | Thunderstorm Heavy Rain Hail | Thunderstorm Rain Hail Fog/Mist | Thunderstorm Light Rain Hail Fog/Mist | Thunderstorm Heavy Rain Hail Fog/Mist | Thunderstorm in Vicinity Hail | Thunderstorm in Vicinity Hail Haze | Thunderstorm Haze in Vicinity Hail | Thunderstorm Light Rain Hail Haze | Thunderstorm Heavy Rain Hail Haze | Thunderstorm Hail Fog | Thunderstorm Light Rain Hail Fog | Thunderstorm Heavy Rain Hail Fog | Thunderstorm Small Hail/Snow Pellets | Thunderstorm Rain Small Hail/Snow Pellets | Light Thunderstorm Rain Small Hail/Snow Pellets | Heavy Thunderstorm Rain Small Hail/Snow Pellets |","tsra.jpg");
        put("Snow | Light Snow | Heavy Snow | Snow Showers | Light Snow Showers | Heavy Snow Showers | Showers Snow | Light Showers Snow | Heavy Showers Snow | Snow Fog/Mist | Light Snow Fog/Mist | Heavy Snow Fog/Mist | Snow Showers Fog/Mist | Light Snow Showers Fog/Mist | Heavy Snow Showers Fog/Mist | Showers Snow Fog/Mist | Light Showers Snow Fog/Mist | Heavy Showers Snow Fog/Mist | Snow Fog | Light Snow Fog | Heavy Snow Fog | Snow Showers Fog | Light Snow Showers Fog | Heavy Snow Showers Fog | Showers Snow Fog | Light Showers Snow Fog | Heavy Showers Snow Fog | Showers in Vicinity Snow | Snow Showers in Vicinity | Snow Showers in Vicinity Fog/Mist | Snow Showers in Vicinity Fog | Low Drifting Snow | Blowing Snow | Snow Low Drifting Snow | Snow Blowing Snow | Light Snow Low Drifting Snow | Light Snow Blowing Snow | Light Snow Blowing Snow Fog/Mist | Heavy Snow Low Drifting Snow | Heavy Snow Blowing Snow | Thunderstorm Snow | Light Thunderstorm Snow | Heavy Thunderstorm Snow | Snow Grains | Light Snow Grains | Heavy Snow Grains | Heavy Blowing Snow | Blowing Snow in Vicinity |","sn.jpg");
        put("Windy | Breezy | Fair and Windy | A Few Clouds and Windy | Partly Cloudy and Windy | Mostly Cloudy and Windy | Overcast and Windy |","wind.jpg");
        put("Showers in Vicinity | Showers in Vicinity Fog/Mist | Showers in Vicinity Fog | Showers in Vicinity Haze |","hi_shwrs.jpg");
        put("Freezing Rain Rain | Light Freezing Rain Rain | Heavy Freezing Rain Rain | Rain Freezing Rain | Light Rain Freezing Rain | Heavy Rain Freezing Rain | Freezing Drizzle Rain | Light Freezing Drizzle Rain | Heavy Freezing Drizzle Rain | Rain Freezing Drizzle | Light Rain Freezing Drizzle | Heavy Rain Freezing Drizzle |","fzrara.jpg");
        put("Thunderstorm in Vicinity | Thunderstorm in Vicinity Fog | Thunderstorm in Vicinity Haze |","hi_tsra.jpg");
        put("Light Rain | Drizzle | Light Drizzle | Heavy Drizzle | Light Rain Fog/Mist | Drizzle Fog/Mist | Light Drizzle Fog/Mist | Heavy Drizzle Fog/Mist | Light Rain Fog | Drizzle Fog | Light Drizzle Fog | Heavy Drizzle Fog |","ra1.jpg");
        put("Rain | Heavy Rain | Rain Fog/Mist | Heavy Rain Fog/Mist | Rain Fog | Heavy Rain Fog |","ra.jpg");
        put("Funnel Cloud | Funnel Cloud in Vicinity | Tornado/Water Spout |","nsvrtsra.jpg");
        put("Dust | Low Drifting Dust | Blowing Dust | Sand | Blowing Sand | Low Drifting Sand | Dust/Sand Whirls | Dust/Sand Whirls in Vicinity | Dust Storm | Heavy Dust Storm | Dust Storm in Vicinity | Sand Storm | Heavy Sand Storm | Sand Storm in Vicinity |","dust.jpg");
        put("Haze |","mist.jpg");
    }};


}
