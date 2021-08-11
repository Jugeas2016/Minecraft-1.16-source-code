/*    */ import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
/*    */ import javax.annotation.Nullable;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public abstract class cui<M extends cui<M>>
/*    */ {
/* 10 */   private final long[] b = new long[2];
/* 11 */   private final cgb[] c = new cgb[2];
/*    */   private boolean d;
/*    */   protected final Long2ObjectOpenHashMap<cgb> a;
/*    */   
/*    */   protected cui(Long2ObjectOpenHashMap<cgb> ☃) {
/* 16 */     this.a = ☃;
/* 17 */     c();
/* 18 */     this.d = true;
/*    */   }
/*    */   
/*    */   public abstract M b();
/*    */   
/*    */   public void a(long ☃) {
/* 24 */     this.a.put(☃, ((cgb)this.a.get(☃)).b());
/* 25 */     c();
/*    */   }
/*    */   
/*    */   public boolean b(long ☃) {
/* 29 */     return this.a.containsKey(☃);
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public cgb c(long ☃) {
/* 34 */     if (this.d) {
/* 35 */       for (int i = 0; i < 2; i++) {
/* 36 */         if (☃ == this.b[i]) {
/* 37 */           return this.c[i];
/*    */         }
/*    */       } 
/*    */     }
/* 41 */     cgb cgb1 = (cgb)this.a.get(☃);
/* 42 */     if (cgb1 != null) {
/* 43 */       if (this.d) {
/* 44 */         for (int i = 1; i > 0; i--) {
/* 45 */           this.b[i] = this.b[i - 1];
/* 46 */           this.c[i] = this.c[i - 1];
/*    */         } 
/* 48 */         this.b[0] = ☃;
/* 49 */         this.c[0] = cgb1;
/*    */       } 
/* 51 */       return cgb1;
/*    */     } 
/* 53 */     return null;
/*    */   }
/*    */ 
/*    */   
/*    */   @Nullable
/*    */   public cgb d(long ☃) {
/* 59 */     return (cgb)this.a.remove(☃);
/*    */   }
/*    */   
/*    */   public void a(long ☃, cgb cgb1) {
/* 63 */     this.a.put(☃, cgb1);
/*    */   }
/*    */   
/*    */   public void c() {
/* 67 */     for (int ☃ = 0; ☃ < 2; ☃++) {
/* 68 */       this.b[☃] = Long.MAX_VALUE;
/* 69 */       this.c[☃] = null;
/*    */     } 
/*    */   }
/*    */   
/*    */   public void d() {
/* 74 */     this.d = false;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\cui.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */