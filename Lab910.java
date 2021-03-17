package CTF01.Java.part1.No4_5;

public class Lab910
{

	public static void main(String[] args)
	{
		System.out.println("Lab 9. Continue กับ For");
//		1. กำหนดตัวแปร count สำหรับนับจำนวนรอบ
//			a. count = 20
//			b. ถ้า count มีค่าเป็น 11 คำสั่ง continue ภายใน if จะทำงาน
//			c. ให้แสดงค่า 11 และเริ่มต้นรอบใหม่โดยไม่สนใจคำสั่งที่เหลือด้านล่าง
		System.out.print("1. เริ่ม count จำนวน 20 รอบ : ");
		for (int count = 0; count < 20; count++) {
			if (count == 11)
			{
				System.out.println("11 ");
				continue;
			}
			System.out.print(count + " ");
		}
		System.out.println();
		
		System.out.println("Lab 10. ทำพร้อมๆกัน Continue");
//		1.ให้สร้างโปรแกรมวน loop 10 รอบ ให้แสดงทุกค่ายกเว้นค่า 2 โดยใช้คำสั่ง continue
		System.out.print("แสดงค่าวน loop 10 รอบ : ");
		for (int count = 0; count < 10; count++) {
			if (count == 2) {
				continue;
			}
			System.out.print(count + " ");
		}
		
	}

}
