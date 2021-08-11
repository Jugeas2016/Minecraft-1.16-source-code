/*    */ import com.mojang.datafixers.DataFixer;
/*    */ import java.io.File;
/*    */ import java.io.IOException;
/*    */ import java.util.function.Supplier;
/*    */ import javax.annotation.Nullable;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class cgu
/*    */   implements AutoCloseable
/*    */ {
/*    */   private final cgv a;
/*    */   protected final DataFixer b;
/*    */   @Nullable
/*    */   private crg c;
/*    */   
/*    */   public cgu(File ☃, DataFixer dataFixer, boolean bool) {
/* 28 */     this.b = dataFixer;
/* 29 */     this.a = new cgv(☃, bool, "chunk");
/*    */   }
/*    */   
/*    */   public md a(vj<brx> ☃, Supplier<cyc> supplier, md md1) {
/* 33 */     int i = a(md1);
/*    */     
/* 35 */     int j = 1493;
/* 36 */     if (i < 1493) {
/* 37 */       md1 = mp.a(this.b, aga.c, md1, i, 1493);
/*    */       
/* 39 */       if (md1.p("Level").q("hasLegacyStructureData")) {
/* 40 */         if (this.c == null) {
/* 41 */           this.c = crg.a(☃, supplier.get());
/*    */         }
/* 43 */         md1 = this.c.a(md1);
/*    */       } 
/*    */     } 
/*    */     
/* 47 */     md1 = mp.a(this.b, aga.c, md1, Math.max(1493, i));
/* 48 */     if (i < w.a().getWorldVersion()) {
/* 49 */       md1.b("DataVersion", w.a().getWorldVersion());
/*    */     }
/*    */     
/* 52 */     return md1;
/*    */   }
/*    */   
/*    */   public static int a(md ☃) {
/* 56 */     return ☃.c("DataVersion", 99) ? ☃.h("DataVersion") : -1;
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public md e(brd ☃) throws IOException {
/* 61 */     return this.a.a(☃);
/*    */   }
/*    */   
/*    */   public void a(brd ☃, md md1) {
/* 65 */     this.a.a(☃, md1);
/*    */     
/* 67 */     if (this.c != null) {
/* 68 */       this.c.a(☃.a());
/*    */     }
/*    */   }
/*    */   
/*    */   public void i() {
/* 73 */     this.a.a().join();
/*    */   }
/*    */ 
/*    */   
/*    */   public void close() throws IOException {
/* 78 */     this.a.close();
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\cgu.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */