import groovy.json.JsonSlurper

def inputFile = new File("myJsonLogs.txt")
def InputJSON = new JsonSlurper().parseText(inputFile.text)

println InputJSON.thrown.cause.message