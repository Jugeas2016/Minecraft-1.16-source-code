/*    */ import com.google.gson.JsonObject;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public interface af<T extends ag>
/*    */ {
/*    */   vk a();
/*    */   
/*    */   void a(vt paramvt, a<T> parama);
/*    */   
/*    */   void b(vt paramvt, a<T> parama);
/*    */   
/*    */   void a(vt paramvt);
/*    */   
/*    */   T a(JsonObject paramJsonObject, ax paramax);
/*    */   
/*    */   public static class a<T extends ag>
/*    */   {
/*    */     private final T a;
/*    */     private final y b;
/*    */     private final String c;
/*    */     
/*    */     public a(T ☃, y y1, String str) {
/* 25 */       this.a = ☃;
/* 26 */       this.b = y1;
/* 27 */       this.c = str;
/*    */     }
/*    */     
/*    */     public T a() {
/* 31 */       return this.a;
/*    */     }
/*    */     
/*    */     public void a(vt ☃) {
/* 35 */       ☃.a(this.b, this.c);
/*    */     }
/*    */ 
/*    */     
/*    */     public boolean equals(Object ☃) {
/* 40 */       if (this == ☃) {
/* 41 */         return true;
/*    */       }
/* 43 */       if (☃ == null || getClass() != ☃.getClass()) {
/* 44 */         return false;
/*    */       }
/*    */       
/* 47 */       a<?> a1 = (a)☃;
/*    */       
/* 49 */       if (!this.a.equals(a1.a)) {
/* 50 */         return false;
/*    */       }
/* 52 */       if (!this.b.equals(a1.b)) {
/* 53 */         return false;
/*    */       }
/* 55 */       return this.c.equals(a1.c);
/*    */     }
/*    */ 
/*    */     
/*    */     public int hashCode() {
/* 60 */       int ☃ = this.a.hashCode();
/* 61 */       ☃ = 31 * ☃ + this.b.hashCode();
/* 62 */       ☃ = 31 * ☃ + this.c.hashCode();
/* 63 */       return ☃;
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\af.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */