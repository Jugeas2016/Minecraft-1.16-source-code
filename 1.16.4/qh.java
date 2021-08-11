/*    */ import java.io.IOException;
/*    */ 
/*    */ public class qh
/*    */   implements oj<om>
/*    */ {
/*    */   public a a;
/*    */   public int b;
/*    */   public int c;
/*    */   public int d;
/*    */   public nr e;
/*    */   
/*    */   public enum a
/*    */   {
/* 14 */     a,
/* 15 */     b,
/* 16 */     c;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public qh() {}
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public qh(apj ☃, a a1) {
/* 30 */     this(☃, a1, oe.d);
/*    */   }
/*    */   
/*    */   public qh(apj ☃, a a1, nr nr1) {
/* 34 */     this.a = a1;
/*    */     
/* 36 */     aqm aqm = ☃.c();
/*    */     
/* 38 */     switch (null.a[a1.ordinal()]) {
/*    */       case 1:
/* 40 */         this.d = ☃.f();
/* 41 */         this.c = (aqm == null) ? -1 : aqm.Y();
/*    */         break;
/*    */       case 2:
/* 44 */         this.b = ☃.h().Y();
/* 45 */         this.c = (aqm == null) ? -1 : aqm.Y();
/* 46 */         this.e = nr1;
/*    */         break;
/*    */     } 
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(nf ☃) throws IOException {
/* 53 */     this.a = ☃.<a>a(a.class);
/*    */     
/* 55 */     if (this.a == a.b) {
/* 56 */       this.d = ☃.i();
/* 57 */       this.c = ☃.readInt();
/* 58 */     } else if (this.a == a.c) {
/* 59 */       this.b = ☃.i();
/* 60 */       this.c = ☃.readInt();
/* 61 */       this.e = ☃.h();
/*    */     } 
/*    */   }
/*    */ 
/*    */   
/*    */   public void b(nf ☃) throws IOException {
/* 67 */     ☃.a(this.a);
/*    */     
/* 69 */     if (this.a == a.b) {
/* 70 */       ☃.d(this.d);
/* 71 */       ☃.writeInt(this.c);
/* 72 */     } else if (this.a == a.c) {
/* 73 */       ☃.d(this.b);
/* 74 */       ☃.writeInt(this.c);
/* 75 */       ☃.a(this.e);
/*    */     } 
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(om ☃) {
/* 81 */     ☃.a(this);
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean a() {
/* 86 */     return (this.a == a.c);
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\qh.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */