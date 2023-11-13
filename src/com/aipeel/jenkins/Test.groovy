def path = new File( "." ).getCanonicalPath()
def newPath = path.split("src")[0]+"/resources/lib"
println newPath