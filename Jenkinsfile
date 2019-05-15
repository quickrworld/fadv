node {
    stage ("git checkout") {
        bat "echo checkout..."
        bat "cd"
        bat "dir"
        git "https://github.com/quickrworld/fadv.git"
        bat "cd"
        bat "dir"
    }
    stage ("Build") {
        bat "dir"
        bat "mvn clean install"
        bar "dir"
        dir("target") {
            bat "dir"
            bat "java -cp C:\Users\Amitabh\.m2\repository\com\quickrworld\test\fadv\fadv\1.0-SNAPSHOT\fadv-1.0-SNAPSHOT.jar;%CLASSPATH% com.quickrworld.test.fadv.App"
        }
    }
}