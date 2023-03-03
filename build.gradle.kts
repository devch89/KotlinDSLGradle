buildscript {
        repositories {
            //where our dependencies get fetched from
            google()
            mavenCentral()
        }
    dependencies{
        classpath("com.android.tools.build:gradle:7.1.0")
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:1.7.0")
    }
}
// task that needs to be declared - clean which will delete all of th already built files
// allows a fulls rebuild without any gradle caches
tasks.register("clean", Delete::class){
    delete(rootProject.buildDir)
}