/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class emq
/*    */   implements enw<emq>
/*    */ {
/*    */   private final vk a;
/*    */   private final float b;
/*    */   private final float c;
/*    */   private final int d;
/*    */   private final a e;
/*    */   private final boolean f;
/*    */   private final boolean g;
/*    */   private final int h;
/*    */   
/*    */   public emq(String ☃, float f1, float f2, int i, a a1, boolean bool1, boolean bool2, int j) {
/* 18 */     this.a = new vk(☃);
/* 19 */     this.b = f1;
/* 20 */     this.c = f2;
/* 21 */     this.d = i;
/* 22 */     this.e = a1;
/* 23 */     this.f = bool1;
/* 24 */     this.g = bool2;
/* 25 */     this.h = j;
/*    */   }
/*    */   
/*    */   public vk a() {
/* 29 */     return this.a;
/*    */   }
/*    */   
/*    */   public vk b() {
/* 33 */     return new vk(this.a.b(), "sounds/" + this.a.a() + ".ogg");
/*    */   }
/*    */   
/*    */   public float c() {
/* 37 */     return this.b;
/*    */   }
/*    */   
/*    */   public float d() {
/* 41 */     return this.c;
/*    */   }
/*    */ 
/*    */   
/*    */   public int e() {
/* 46 */     return this.d;
/*    */   }
/*    */ 
/*    */   
/*    */   public emq f() {
/* 51 */     return this;
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(enr ☃) {
/* 56 */     if (this.g) {
/* 57 */       ☃.a(this);
/*    */     }
/*    */   }
/*    */   
/*    */   public a g() {
/* 62 */     return this.e;
/*    */   }
/*    */   
/*    */   public boolean h() {
/* 66 */     return this.f;
/*    */   }
/*    */   
/*    */   public boolean i() {
/* 70 */     return this.g;
/*    */   }
/*    */   
/*    */   public int j() {
/* 74 */     return this.h;
/*    */   }
/*    */   
/*    */   public enum a {
/* 78 */     a("file"),
/* 79 */     b("event");
/*    */     
/*    */     private final String c;
/*    */     
/*    */     a(String ☃) {
/* 84 */       this.c = ☃;
/*    */     }
/*    */     
/*    */     public static a a(String ☃) {
/* 88 */       for (a a1 : values()) {
/* 89 */         if (a1.c.equals(☃)) {
/* 90 */           return a1;
/*    */         }
/*    */       } 
/* 93 */       return null;
/*    */     }
/*    */   }
/*    */ 
/*    */   
/*    */   public String toString() {
/* 99 */     return "Sound[" + this.a + "]";
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\emq.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */