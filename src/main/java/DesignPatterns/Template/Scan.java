//package Patterns.Template;
//
//import java.io.File;
//import java.util.regex.Matcher;
//import java.util.regex.Pattern;
//
//public abstract class Scan {
//    private String _directory;
//    private String _pattern;
//    private boolean _recurse;
//    Matcher _fileMatcher;
//    Matcher _searchMatcher;
//
//    public Scan(String directory, String filePattern, String searchPattern, Boolean recurse){
//        _directory = directory;
//        _pattern = filePattern;
//        _recurse = recurse;
//        _fileMatcher = Pattern.compile(_pattern).matcher("");
//        _searchMatcher = Pattern.compile(searchPattern).matcher("");
//    }
//
//    public final void main(String[] args) {
//
//        String directory = "";
//        String filePattern = "";
//        String searchPattern = "";
//        boolean recurse = false;
//
//        if (args.length == 2) {
//            _recurse = false;
//            directory = args[0];
//            filePattern = args[1];
//        }
//        else if (args.length == 3 && args[0].equals("-r")) {
//            recurse = true;
//            directory = args[1];
//            filePattern = args[2];
//        }
//        else if (args.length == 3) {
//            recurse = false;
//            directory = args[0];
//            filePattern = args[1];
//            searchPattern = args[2];
//        }
//        else if (args.length == 4 && args[0].equals("-r")) {
//            recurse = true;
//            directory = args[1];
//            filePattern = args[2];
//            searchPattern = args[3];
//        }
//        else {
//            usage();
//            return;
//        }
//
//        File dir = new File(directory);
//
//        String result = run(dir, filePattern, searchPattern, recurse);
//        System.out.println(result);
//    }
//
//    protected abstract String run(File directory, boolean recurse);
//
//    protected abstract void usage();
//
//}
