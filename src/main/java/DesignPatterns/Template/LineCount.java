//package Patterns.Template;
//
//import java.io.*;
//import java.util.*;
//import java.util.regex.*;
//
//public class LineCount extends Scan {
//	private int _totalLineCount;
//
//	public LineCount(String directory, String filePattern, String searchPattern, Boolean recurse) {
//		super(directory, filePattern, searchPattern, recurse);
//	}
//
//	@Override
//	protected String run(File dir, boolean recurse) {
//		if (dir.isDirectory())
//		{
//			if (dir.canRead())
//			{
//				for (File file : dir.listFiles()) {
//					if (file.isFile()) {
//						if (file.canRead()) {
//							countLinesInFile(file);
//						}
//						else {
//							System.out.println("File " + file + " is unreadable");
//						}
//					}
//				}
//
//				if (recurse) {
//					for (File file : dir.listFiles()) {
//						if (file.isDirectory()) {
//							run(file, recurse);
//						}
//					}
//				}
//			}
//			else {
//				return "Directory " + dir + " is unreadable";
//			}
//		}
//		else {
//			return dir + " is not a directory";
//		}
//		return "TOTAL: " + _totalLineCount;
//	}
//
//	private void countLinesInFile(File file) {
//		String fileName = getFileName(file);
//		_matcher.reset(fileName);
//		if (_matcher.find()) {
//			try {
//				Reader reader = new BufferedReader(new FileReader(file));
//				int curLineCount = 0;
//				try {
//					curLineCount = 0;
//					Scanner input = new Scanner(reader);
//					while (input.hasNextLine()) {
//						String line = input.nextLine();
//						++curLineCount;
//						++_totalLineCount;
//					}
//				}
//				finally {
//					System.out.println(curLineCount + "  " + file);
//					reader.close();
//				}
//			}
//			catch (IOException e) {
//				System.out.println("File " + file + " is unreadable");
//			}
//		}
//	}
//
//	private String getFileName(File file) {
//		try {
//			return file.getCanonicalPath();
//		}
//		catch (IOException e) {
//			return "";
//		}
//	}
//
//	@Override
//	protected void usage() {
//		System.out.println("USAGE: java LineCount {-r} <dir> <file-pattern>");
//	}
//
//}
