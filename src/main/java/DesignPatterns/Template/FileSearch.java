//package Patterns.Template;
//
//import java.io.*;
//import java.util.*;
//import java.util.regex.*;
//
//public class FileSearch extends Scan {
//	private int _totalMatches;
//	private String text;
//
//	public FileSearch(String dirName, String filePattern, String searchPattern, boolean recurse) {
//		super(dirName, filePattern, searchPattern, recurse);
//	}
//
//	@Override
//	protected String run(File dir, boolean recurse) {
//		if (!dir.isDirectory()) {
//			return dir + " is not a directory";
//		}
//
//		if (!dir.canRead()) {
//			return "Directory " + dir + " is unreadable";
//		}
//
//		for (File file : dir.listFiles()) {
//			if (file.isFile()) {
//				if (file.canRead()) {
//					searchFile(file);
//				}
//			}
//		}
//
//		if (recurse) {
//			for (File file : dir.listFiles()) {
//				if (file.isDirectory()) {
//					run(file, recurse);
//				}
//			}
//		}
//		return text + "TOTAL MATCHES: " + _totalMatches;
//	}
//
//	private String searchFile(File file) {
//		String fileName = "";
//
//		try {
//			fileName = file.getCanonicalPath();
//		}
//		catch (IOException e) {
//		}
//
//		_fileMatcher.reset(fileName);
//		if (_fileMatcher.find()) {
//			try {
//				int curMatches = 0;
//
//				InputStream data = new BufferedInputStream(new FileInputStream(file));
//				try {
//					Scanner input = new Scanner(data);
//					while (input.hasNextLine()) {
//						String line = input.nextLine();
//
//						_searchMatcher.reset(line);
//						if (_searchMatcher.find()) {
//							if (++curMatches == 1) {
//								text.concat("FILE: " + file);
//							}
//
//							text.concat(line);
//							++_totalMatches;
//						}
//					}
//				}
//				finally {
//					data.close();
//
//					if (curMatches > 0) {
//						System.out.println("MATCHES: " + curMatches);
//					}
//				}
//			}
//			catch (IOException e) {
//				return "File " + file + " is unreadable";
//			}
//		}
//		return text;
//	}
//
//	@Override
//	protected void usage() {
//		System.out.println("USAGE: java FileSearch {-r} <dir> <file-pattern> <search-pattern>");
//	}
//
//}
