package com.exceptionhandling;

public class ExceptionScenarios {

	public static void main(String[] args) {

		System.out.println("ExceptionScenarios");

//		try {
//			System.out.println(10 / 0);
//		} catch (Exception e) {
//			System.out.println(e);
//		}

		/*
		 * 1. try { //not allowed }
		 */

		/*
		 * 2. try { //allowed }catch(Exception ex) {
		 * 
		 * }
		 */

		/*
		 * 3. try { //allowed }finally {
		 * 
		 * }
		 */

		/*
		 * 4. try { //allowed }catch(Exception e) {
		 * 
		 * }finally {
		 * 
		 * }
		 */

		/*
		 * 5. try { //allowed }catch(ArithmeticException e) {
		 * 
		 * }catch(Exception e1) {
		 * 
		 * }
		 */

		/*
		 * 6. try { //Not allowed }catch(Exception e1) { //super class
		 * 
		 * }catch(ArithmeticException e2) { //sub class //Super class or Bigger
		 * exception is not allowed in first catch block //Reason- exception is handled
		 * at first catch block so //there is no any chance to reach second catch block.
		 * }
		 */
		/*
		 * 7.try{ //not allowed} catch(Exception e) { } catch(NullPointerException npe)
		 * { }
		 */
		try {
			System.out.println(10 / 0);
		} catch (NullPointerException e) {
			System.out.println("if this catch block cant handle the exception then next block will");
			System.out.println(e);
		} catch (Exception e1) {
			System.out.println("exception occur "+e1);
		}

	}
}
