/*    */ import it.unimi.dsi.fastutil.longs.Long2ObjectLinkedOpenHashMap;
/*    */ import it.unimi.dsi.fastutil.objects.ObjectIterator;
/*    */ import java.io.DataInputStream;
/*    */ import java.io.DataOutputStream;
/*    */ import java.io.File;
/*    */ import java.io.IOException;
/*    */ import javax.annotation.Nullable;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public final class cgz
/*    */   implements AutoCloseable
/*    */ {
/* 18 */   private final Long2ObjectLinkedOpenHashMap<cgy> a = new Long2ObjectLinkedOpenHashMap();
/*    */   private final File b;
/*    */   private final boolean c;
/*    */   
/*    */   cgz(File ☃, boolean bool) {
/* 23 */     this.b = ☃;
/* 24 */     this.c = bool;
/*    */   }
/*    */   
/*    */   private cgy b(brd ☃) throws IOException {
/* 28 */     long l = brd.a(☃.h(), ☃.i());
/* 29 */     cgy cgy1 = (cgy)this.a.getAndMoveToFirst(l);
/* 30 */     if (cgy1 != null) {
/* 31 */       return cgy1;
/*    */     }
/*    */     
/* 34 */     if (this.a.size() >= 256) {
/* 35 */       ((cgy)this.a.removeLast()).close();
/*    */     }
/*    */     
/* 38 */     if (!this.b.exists()) {
/* 39 */       this.b.mkdirs();
/*    */     }
/*    */     
/* 42 */     File file = new File(this.b, "r." + ☃.h() + "." + ☃.i() + ".mca");
/* 43 */     cgy cgy2 = new cgy(file, this.b, this.c);
/* 44 */     this.a.putAndMoveToFirst(l, cgy2);
/* 45 */     return cgy2;
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public md a(brd ☃) throws IOException {
/* 50 */     cgy cgy = b(☃);
/* 51 */     try (DataInputStream ☃ = cgy.a(☃)) {
/* 52 */       if (dataInputStream == null) {
/* 53 */         return null;
/*    */       }
/*    */       
/* 56 */       return mn.a(dataInputStream);
/*    */     } 
/*    */   }
/*    */   
/*    */   protected void a(brd ☃, md md1) throws IOException {
/* 61 */     cgy cgy = b(☃);
/* 62 */     try (DataOutputStream ☃ = cgy.c(☃)) {
/* 63 */       mn.a(md1, dataOutputStream);
/*    */     } 
/*    */   }
/*    */ 
/*    */   
/*    */   public void close() throws IOException {
/* 69 */     aey<IOException> ☃ = new aey<>();
/* 70 */     for (ObjectIterator<cgy> objectIterator = this.a.values().iterator(); objectIterator.hasNext(); ) { cgy cgy = objectIterator.next();
/*    */       try {
/* 72 */         cgy.close();
/* 73 */       } catch (IOException iOException) {
/* 74 */         ☃.a(iOException);
/*    */       }  }
/*    */     
/* 77 */     ☃.a();
/*    */   }
/*    */   
/*    */   public void a() throws IOException {
/* 81 */     for (ObjectIterator<cgy> objectIterator = this.a.values().iterator(); objectIterator.hasNext(); ) { cgy ☃ = objectIterator.next();
/* 82 */       ☃.a(); }
/*    */   
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\cgz.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */