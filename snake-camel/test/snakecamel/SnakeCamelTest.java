package snakecamel;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.*;


public class SnakeCamelTest {
	@Test
	public void snakeToCamelcaseのテストその1() {
		SnakeCamelUtil scu = new SnakeCamelUtil();
		String expected = "Abc";
		String actual  = scu.snakeToCamelcase("abc");
		assertThat(actual, is(expected));
		System.out.println(actual);
	}
	@Test
	public void snakeToCamelcaseのテストその2() {
		SnakeCamelUtil scu = new SnakeCamelUtil();
		String expected = "AbcDef";
		String actual  = scu.snakeToCamelcase("abc_def");
		assertThat(actual, is(expected));
		System.out.println(actual);
	}
	@Test
	public void snakeToCamelcaseのテストその3() {
		SnakeCamelUtil scu = new SnakeCamelUtil();
		String expected = "AbcDefGh";
		String actual  = scu.snakeToCamelcase("abc_def_gh");
		assertThat(actual, is(expected));
		System.out.println(actual);
	}
	@Test
	public void snakeToCamelcaseのテストその4() {
		SnakeCamelUtil scu = new SnakeCamelUtil();
		String expected = "AbcDefGh";
		String actual  = scu.snakeToCamelcase("abc__def___gh");
		assertThat(actual, is(expected));
		System.out.println(actual);
	}
	@Test
	public void snakeToCamelcaseのテストその5() {
		SnakeCamelUtil scu = new SnakeCamelUtil();
		String expected = "AbcDef";
		String actual  = scu.snakeToCamelcase("_abc_def__");
		assertThat(actual, is(expected));
		System.out.println(actual);
	}
	
	@Test
	public void camelToSnakecaseのテストその1() {
		SnakeCamelUtil scu = new SnakeCamelUtil();
		String expected = "abc";
		String actual = scu.camelToSnakecase("Abc");
		assertThat(actual, is(expected));
		System.out.println(actual);
	}
	@Test
	public void camelToSnakecaseのテストその2() {
		SnakeCamelUtil scu = new SnakeCamelUtil();
		String expected = "abc_def";
		String actual = scu.camelToSnakecase("AbcDef");
		assertThat(actual, is(expected));
		System.out.println(actual);
	}
	@Test
	public void camelToSnakecaseのテストその3() {
		SnakeCamelUtil scu = new SnakeCamelUtil();
		String expected = "abc_def_gh";
		String actual = scu.camelToSnakecase("AbcDefGh");
		assertThat(actual, is(expected));
		System.out.println(actual);
	}
	
	@Test
	public void capitalizeのテストその1() {
		SnakeCamelUtil scu = new SnakeCamelUtil();
		String expected = "";
		String actual = scu.capitalize("");
		assertThat(actual, is(expected));
		System.out.println(actual);
	}
	@Test
	public void capitalizeのテストその2() {
		SnakeCamelUtil scu = new SnakeCamelUtil();
		String expected = "A";
		String actual = scu.capitalize("a");
		assertThat(actual, is(expected));
		System.out.println(actual);
	}
	@Test
	public void capitalizeのテストその3() {
		SnakeCamelUtil scu = new SnakeCamelUtil();
		String expected = "Xyz";
		String actual = scu.capitalize("xyz");
		assertThat(actual, is(expected));
		System.out.println(actual);
	}
	
	@Test
	public void uncapitalizeのテストその1() {
		SnakeCamelUtil scu = new SnakeCamelUtil();
		String expected = "";
		String actual = scu.uncapitalize("");
		assertThat(actual, is(expected));
		System.out.println(actual);
	}
	@Test
	public void uncapitalizeのテストその2() {
		SnakeCamelUtil scu = new SnakeCamelUtil();
		String expected = "a";
		String actual = scu.uncapitalize("A");
		assertThat(actual, is(expected));
		System.out.println(actual);
	}
	@Test
	public void uncapitalizeのテストその3() {
		SnakeCamelUtil scu = new SnakeCamelUtil();
		String expected = "xyz";
		String actual = scu.uncapitalize("Xyz");
		assertThat(actual, is(expected));
		System.out.println(actual);
	}
}
