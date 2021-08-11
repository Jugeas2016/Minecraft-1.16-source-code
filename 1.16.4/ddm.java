/*    */ import java.util.Comparator;
/*    */ import javax.annotation.Nullable;
/*    */ 
/*    */ public class ddm
/*    */ {
/*    */   static {
/*  7 */     a = ((☃, ddm1) -> (☃.b() > ddm1.b()) ? 1 : ((☃.b() < ddm1.b()) ? -1 : ddm1.e().compareToIgnoreCase(☃.e())));
/*    */   }
/*    */ 
/*    */   
/*    */   public static final Comparator<ddm> a;
/*    */   
/*    */   private final ddn b;
/*    */   
/*    */   @Nullable
/*    */   private final ddk c;
/*    */   
/*    */   private final String d;
/*    */   
/*    */   private int e;
/*    */   
/*    */   private boolean f;
/*    */   private boolean g;
/*    */   
/*    */   public ddm(ddn ☃, ddk ddk1, String str) {
/* 26 */     this.b = ☃;
/* 27 */     this.c = ddk1;
/* 28 */     this.d = str;
/* 29 */     this.f = true;
/* 30 */     this.g = true;
/*    */   }
/*    */   
/*    */   public void a(int ☃) {
/* 34 */     if (this.c.c().d()) {
/* 35 */       throw new IllegalStateException("Cannot modify read-only score");
/*    */     }
/* 37 */     c(b() + ☃);
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public void a() {
/* 45 */     a(1);
/*    */   }
/*    */   
/*    */   public int b() {
/* 49 */     return this.e;
/*    */   }
/*    */   
/*    */   public void c() {
/* 53 */     c(0);
/*    */   }
/*    */   
/*    */   public void c(int ☃) {
/* 57 */     int i = this.e;
/* 58 */     this.e = ☃;
/* 59 */     if (i != ☃ || this.g) {
/* 60 */       this.g = false;
/* 61 */       f().a(this);
/*    */     } 
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public ddk d() {
/* 67 */     return this.c;
/*    */   }
/*    */   
/*    */   public String e() {
/* 71 */     return this.d;
/*    */   }
/*    */   
/*    */   public ddn f() {
/* 75 */     return this.b;
/*    */   }
/*    */   
/*    */   public boolean g() {
/* 79 */     return this.f;
/*    */   }
/*    */   
/*    */   public void a(boolean ☃) {
/* 83 */     this.f = ☃;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\ddm.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */