package com.example;

public class VariableDemo {
    public static void main(String[] args) {
        // --- 1. Primitive Data Types (ข้อมูลพื้นฐาน) ---

        // เก็บจำนวนเต็ม (Integer types)
        byte byteVar = 127; // มีค่า -128 ถึง 127
        short shortVar = 32000; // มีค่า -32768 ถึง 32767
        int intVar = 1000000; // ตัวเลขจำนวนเต็มทั่วไป
        long longVar = 9000000000L; // เลขจำนวนเต็มที่มีค่ามาก (ต้องลงท้ายด้วย L)

        // เก็บเลขทศนิยม (Floating point types)
        float floatVar = 20.55f; // ทศนิยมแบบ Single precision (ต้องลงท้ายด้วย f)
        double doubleVar = 123.456789; // ทศนิยมแบบ Double precision (มาตรฐาน)

        // เก็บตัวอักษรเดียว (Character type)
        char charVar = 'A'; // ใช้ single quotes

        // เก็บค่าถูก/ผิด (Boolean type)
        boolean boolVar = true; // ค่ามีแค่ true หรือ false

        // --- 2. Reference Data Types (ข้อมูลแบบอ้างอิง) ---
        String stringVar = "สวัสดี Java"; // เก็บข้อความ (ใช้ double quotes)

        // การแสดงผลค่าตัวแปร (Output)
        System.out.println("=== แสดงค่าตัวแปรประเภทต่างๆ ===");
        System.out.println("byte: " + byteVar);
        System.out.println("short: " + shortVar);
        System.out.println("int: " + intVar);
        System.out.println("long: " + longVar);
        System.out.println("float: " + floatVar);
        System.out.println("double: " + doubleVar);
        System.out.println("char: " + charVar);
        System.out.println("boolean: " + boolVar);
        System.out.println("String: " + stringVar);

        // การเปลี่ยนแปลงค่า
        intVar = 200;
        System.out.println("อัพเดทค่า intVar เป็น: " + intVar);
    }
}
