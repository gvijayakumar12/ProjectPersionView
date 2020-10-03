# ProjectPersionView
Library project to show person details (Image/Initials, Name)

# Android minimum version supported
	This library works after Android 5.0(Lollipop), API-21 onwards.

# How to add this library in your project

## Step 1 - Add the JitPack repository to your build file
Add it in your root build.gradle at the end of repositories:

	allprojects {
    		repositories {    
        		....	
        		maven { url 'https://jitpack.io' }	
   		}    
	}
  
## Step 2 - Add the dependency

	dependencies {
		implementation 'com.github.gvijayakumar12:ProjectPersonView:0.0.1'		
	}
  
## Step3 - Add Internet permission in your application Manifest file

	<uses-permission android:name="android.permission.INTERNET"/>






  
