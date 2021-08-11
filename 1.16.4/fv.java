/*    */ 
/*    */ public enum fv
/*    */ {
/*  4 */   a
/*    */   {
/*    */     public int a(int ☃, int i, int j, gc.a a1) {
/*  7 */       return a1.a(☃, i, j);
/*    */     }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/*    */     public gc.a a(gc.a ☃) {
/* 17 */       return ☃;
/*    */     }
/*    */ 
/*    */     
/*    */     public fv a() {
/* 22 */       return this;
/*    */     }
/*    */   },
/*    */ 
/*    */ 
/*    */   
/* 28 */   b
/*    */   {
/*    */     public int a(int ☃, int i, int j, gc.a a1) {
/* 31 */       return a1.a(j, ☃, i);
/*    */     }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/*    */     public gc.a a(gc.a ☃) {
/* 41 */       return d[Math.floorMod(☃.ordinal() + 1, 3)];
/*    */     }
/*    */ 
/*    */     
/*    */     public fv a() {
/* 46 */       return c;
/*    */     }
/*    */   },
/* 49 */   c
/*    */   {
/*    */     public int a(int ☃, int i, int j, gc.a a1) {
/* 52 */       return a1.a(i, j, ☃);
/*    */     }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/*    */     public gc.a a(gc.a ☃) {
/* 62 */       return d[Math.floorMod(☃.ordinal() - 1, 3)];
/*    */     }
/*    */ 
/*    */     
/*    */     public fv a() {
/* 67 */       return b;
/*    */     }
/*    */   };
/*    */   
/*    */   static {
/* 72 */     d = gc.a.values();
/* 73 */     e = values();
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public static final gc.a[] d;
/*    */ 
/*    */ 
/*    */   
/*    */   public static final fv[] e;
/*    */ 
/*    */ 
/*    */   
/*    */   public static fv a(gc.a ☃, gc.a a1) {
/* 88 */     return e[Math.floorMod(a1.ordinal() - ☃.ordinal(), 3)];
/*    */   }
/*    */   
/*    */   public abstract int a(int paramInt1, int paramInt2, int paramInt3, gc.a parama);
/*    */   
/*    */   public abstract gc.a a(gc.a parama);
/*    */   
/*    */   public abstract fv a();
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\fv.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */