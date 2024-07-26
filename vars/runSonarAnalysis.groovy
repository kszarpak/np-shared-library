def call(String scannerHome) {
  withSonarQubeEnv('SonarQube') {
    sh "${ScannerHome}/bin/sonar-scanner"
  }
}
