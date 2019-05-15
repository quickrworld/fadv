node {
    stage ("git checkout") {
        git "https://github.com/quickrworld/fadv.git"
        bat "cd"
        bat "dir"
    }
    stage ("Build") {
        dir("fadv") {
            bat "dir"
            bat "mvn clean install"
        }
        dir("fadv/target") {
            bat "java -cp fadv-1.0-SNAPSHOT.jar;%CLASSPATH% com.quickrworld.test.fadv.App"
        }
    }
}