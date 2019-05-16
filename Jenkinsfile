node {
    stage ("git checkout") {
        git "https://github.com/quickrworld/fadv.git"
    }
    stage ("Build") {
        bat "mvn clean install"
        dir("target") {
            bat "dir"
            bat "java -cp C:\\Users\\Amitabh\\selenium\\libs\\byte-buddy-1.8.15.jar;C:\\Users\\Amitabh\\selenium\\libs\\commons-exec-1.3.jar;C:\\Users\\Amitabh\\selenium\\libs\\guava-25.0-jre.jar;C:\\Users\\Amitabh\\selenium\\libs\\okhttp-3.11.0.jar;C:\\Users\\Amitabh\\selenium\\libs\\okio-1.14.0.jar;C:\\Users\\Amitabh\\selenium\\client-combined-3.141.59.jar;C:\\Users\\Amitabh\\.m2\\repository\\com\\quickrworld\\test\\fadv\\fadv\\1.0-SNAPSHOT\\fadv-1.0-SNAPSHOT.jar com.quickrworld.test.fadv.App"
        }
    }
}