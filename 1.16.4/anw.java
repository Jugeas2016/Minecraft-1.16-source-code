/*    */ import java.util.function.Supplier;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public interface anw
/*    */ {
/*    */   void a();
/*    */   
/*    */   void b();
/*    */   
/*    */   void a(String paramString);
/*    */   
/*    */   void a(Supplier<String> paramSupplier);
/*    */   
/*    */   void c();
/*    */   
/*    */   void b(String paramString);
/*    */   
/*    */   void b(Supplier<String> paramSupplier);
/*    */   
/*    */   void c(String paramString);
/*    */   
/*    */   void c(Supplier<String> paramSupplier);
/*    */   
/*    */   static anw a(anw ☃, anw anw1) {
/* 27 */     if (☃ == ant.a) {
/* 28 */       return anw1;
/*    */     }
/* 30 */     if (anw1 == ant.a) {
/* 31 */       return ☃;
/*    */     }
/* 33 */     return new anw(☃, anw1)
/*    */       {
/*    */         public void a() {
/* 36 */           this.a.a();
/* 37 */           this.b.a();
/*    */         }
/*    */ 
/*    */         
/*    */         public void b() {
/* 42 */           this.a.b();
/* 43 */           this.b.b();
/*    */         }
/*    */ 
/*    */         
/*    */         public void a(String ☃) {
/* 48 */           this.a.a(☃);
/* 49 */           this.b.a(☃);
/*    */         }
/*    */ 
/*    */         
/*    */         public void a(Supplier<String> ☃) {
/* 54 */           this.a.a(☃);
/* 55 */           this.b.a(☃);
/*    */         }
/*    */ 
/*    */         
/*    */         public void c() {
/* 60 */           this.a.c();
/* 61 */           this.b.c();
/*    */         }
/*    */ 
/*    */         
/*    */         public void b(String ☃) {
/* 66 */           this.a.b(☃);
/* 67 */           this.b.b(☃);
/*    */         }
/*    */ 
/*    */         
/*    */         public void b(Supplier<String> ☃) {
/* 72 */           this.a.b(☃);
/* 73 */           this.b.b(☃);
/*    */         }
/*    */ 
/*    */         
/*    */         public void c(String ☃) {
/* 78 */           this.a.c(☃);
/* 79 */           this.b.c(☃);
/*    */         }
/*    */ 
/*    */         
/*    */         public void c(Supplier<String> ☃) {
/* 84 */           this.a.c(☃);
/* 85 */           this.b.c(☃);
/*    */         }
/*    */       };
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\anw.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */