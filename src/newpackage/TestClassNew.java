package newpackage;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class TestClassNew {
	public static void main(String args[]) {
		System.out.println("Tested output");
		methodtoCall();
		ChildClass cls = new ChildClass();
		cls.syso();
	}



//private static void methodtoCall() {
//		// TODO Auto-generated method stub
//		
//	}



private static void methodtoCall() {
		// TODO Auto-generated method stub
	System.out.println("Tested output in the method");
		
	}
}

