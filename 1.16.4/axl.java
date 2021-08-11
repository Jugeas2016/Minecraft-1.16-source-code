/*    */ import java.util.EnumSet;
/*    */ import javax.annotation.Nullable;
/*    */ 
/*    */ public class axl
/*    */   extends avv
/*    */ {
/*    */   private final avv a;
/*    */   private final int b;
/*    */   private boolean c;
/*    */   
/*    */   public axl(int ☃, avv avv1) {
/* 12 */     this.b = ☃;
/* 13 */     this.a = avv1;
/*    */   }
/*    */   
/*    */   public boolean a(axl ☃) {
/* 17 */     return (C_() && ☃.h() < h());
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean a() {
/* 22 */     return this.a.a();
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean b() {
/* 27 */     return this.a.b();
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean C_() {
/* 32 */     return this.a.C_();
/*    */   }
/*    */ 
/*    */   
/*    */   public void c() {
/* 37 */     if (this.c) {
/*    */       return;
/*    */     }
/* 40 */     this.c = true;
/* 41 */     this.a.c();
/*    */   }
/*    */ 
/*    */   
/*    */   public void d() {
/* 46 */     if (!this.c) {
/*    */       return;
/*    */     }
/* 49 */     this.c = false;
/* 50 */     this.a.d();
/*    */   }
/*    */ 
/*    */   
/*    */   public void e() {
/* 55 */     this.a.e();
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(EnumSet<avv.a> ☃) {
/* 60 */     this.a.a(☃);
/*    */   }
/*    */ 
/*    */   
/*    */   public EnumSet<avv.a> i() {
/* 65 */     return this.a.i();
/*    */   }
/*    */   
/*    */   public boolean g() {
/* 69 */     return this.c;
/*    */   }
/*    */   
/*    */   public int h() {
/* 73 */     return this.b;
/*    */   }
/*    */   
/*    */   public avv j() {
/* 77 */     return this.a;
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean equals(@Nullable Object ☃) {
/* 82 */     if (this == ☃) {
/* 83 */       return true;
/*    */     }
/* 85 */     if (☃ == null || getClass() != ☃.getClass()) {
/* 86 */       return false;
/*    */     }
/* 88 */     return this.a.equals(((axl)☃).a);
/*    */   }
/*    */ 
/*    */   
/*    */   public int hashCode() {
/* 93 */     return this.a.hashCode();
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\axl.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */