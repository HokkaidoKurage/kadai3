package snakecamel;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class Main {
	public static void main(String[] args) {
		SnakeCamelUtil scu = new SnakeCamelUtil();
		String expected1 = "Abc";
		String actual1  = scu.snakeToCamelcase("abc");
		assertThat(actual1, is(expected1));
		System.out.println(actual1);

		String expected2 = "AbcDef";
		String actual2  = scu.snakeToCamelcase("abc_def");
		assertThat(actual2, is(expected2));
		System.out.println(actual2);
		
		String expected3 = "AbcDefGh";
		String actual3  = scu.snakeToCamelcase("abc_def_gh");
		assertThat(actual3, is(expected3));
		System.out.println(actual3);
		
		String expected4 = "AbcDefGh";
		String actual4  = scu.snakeToCamelcase("abc__def___gh");
		assertThat(actual4, is(expected4));
		System.out.println(actual4);
	
		String expected5 = "AbcDef";
		String actual5  = scu.snakeToCamelcase("_abc_def__");
		assertThat(actual5, is(expected5));
		System.out.println(actual5);
		
		String expected6 = "abc";
		String actual6 = scu.camelToSnakecase("Abc");
		assertThat(actual6, is(expected6));
		System.out.println(actual6);
	
		String expected7 = "abc_def";
		String actual7 = scu.camelToSnakecase("AbcDef");
		assertThat(actual7, is(expected7));
		System.out.println(actual7);
		
		String expected8 = "abc_def_gh";
		String actual8 = scu.camelToSnakecase("AbcDefGh");
		assertThat(actual8, is(expected8));
		System.out.println(actual8);
	
		String expected9 = "";
		String actual9 = scu.capitalize("");
		assertThat(actual9, is(expected9));
		System.out.println(actual9);
		
		String expected10 = "A";
		String actual10 = scu.capitalize("a");
		assertThat(actual10, is(expected10));
		System.out.println(actual10);
		
		String expected11 = "Xyz";
		String actual11 = scu.capitalize("xyz");
		assertThat(actual11, is(expected11));
		System.out.println(actual11);
		
		String expected12 = "";
		String actual12 = scu.uncapitalize("");
		assertThat(actual12, is(expected12));
		System.out.println(actual12);
		
		String expected13 = "a";
		String actual13 = scu.uncapitalize("A");
		assertThat(actual13, is(expected13));
		System.out.println(actual13);
		
		String expected14 = "xyz";
		String actual14 = scu.uncapitalize("Xyz");
		assertThat(actual14, is(expected14));
		System.out.println(actual14);
		
	}
}
