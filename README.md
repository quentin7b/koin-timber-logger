
Koin Timber Logger  
===  
  
![Version 1.0.0](https://img.shields.io/badge/version-1.0.0-green.svg) ![Hosted on Jitpack.io](https://img.shields.io/badge/hosting-jitpack-blue.svg)  
  
_TL;DR A simple logger for [Koin](https://insert-koin.io/) that uses [Timber](https://github.com/JakeWharton/timber)_  
  
## Usage  
  
Use it as the optional `logger` parameter of `startKoin`  
  
For example  
  
```Kotlin  
startKoin(  
    ...  
    logger = TimberLogger()  
)  
```  
  
### Options
  
The constructor has multiple arguments that you can use to customise the behavior.  
  
  <table>
	  <thead>
		  <tr>
			  <th> param </th>
			  <th> role </th>
			  <th> default  </th>
		  </tr>
	  </thead>
	  <tbody>
		  <tr>
			  <td><code>showDebug</code></td>
			  <td>display <code>d</code> messages or not</td>
			  <td><code>true</code></td>
		  </tr>
		  <tr>
			  <td><code>showErr</code></td>
			  <td>display <code>e</code> messages or not</td>
			  <td><code>true</code></td>
		  </tr>
		  <tr>
			  <td><code>showInfo</code></td>
			  <td>display <code>i</code> messages or not</td>
			  <td><code>true</code></td>
		  </tr>
		  <tr>
			  <td><code>tag</code></td>
			  <td>
				  <div>tag used by timber  as <code>Timber.tag(??).x()</code></div>
				  <div> if <code>null</code> it uses <code>Timber.x()</code> directly</div>
			  </td>
			  <td><code>null</code></td>
		  </tr>
	  </tbody>
  </table>

For example, if you want to use the tag **Koin** and only display **error** messages, then  you can use

```
logger = TimberLogger(  
  showDebug = false,  
  showInfo = false,  
  tag = "Koin"  
)
``` 
 
## Install  
  
Add it over [jitpack.io](https://jitpack.io/docs/ANDROID/)  
  
  
In the *project* `build.gradle`  
  
```gradle  
allprojects {  
    repositories {  
        jcenter()  
        // Maybe google()  
        maven { url "https://jitpack.io" }  
    }  
}  
```  
  
In the *module* `build.gradle`  
  
```gradle  
dependencies {  
    implementation 'com.github.quentin7b:koin-timber-logger:1.1.0'  
}  
```  
  
## License  
  
Project is under [Apache 2](LICENSE)  
Feel free to improve by opening an issue or a pull request