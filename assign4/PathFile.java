package assign4;


public class PathFile {
    private String fixedPath = "C:\\Users\\abodn70\\1DV506\\src\\assign4\\";

    public String getFullPath(String input){
        String fixed = fixedPath+input;
        return fixed;
    }
}