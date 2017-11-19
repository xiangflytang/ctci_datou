package com.interview.ibg;

import java.lang.reflect.Field;

public class FinalPrivateField {
	    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
	        final A instance = new A( 10 );
	        B.updateA( instance, 20 );
	        System.out.println( instance.getField() );
	    }
	 
	    public static class A
	    {
	        private final int m_field;
	 
	        public A( final int field ) {
	            m_field = field;
	        }
	 
	        public int getField() {
	            return m_field;
	        }
//	        public int setField(int newValue){
//	        	m_field = newValue;
//	         } compile error
	    }
	 
	    public static class B
	    {
	        public static void updateA( final A other, final int newValue ) throws NoSuchFieldException, IllegalAccessException
	        {
	            final Field fieldA = A.class.getDeclaredField( "m_field" );
	            fieldA.setAccessible( true );
	            fieldA.setInt( other, newValue );
	        }
	    }
	
}
