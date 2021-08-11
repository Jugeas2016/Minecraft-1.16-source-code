/*     */ import it.unimi.dsi.fastutil.shorts.ShortArrayList;
/*     */ import it.unimi.dsi.fastutil.shorts.ShortList;
/*     */ import java.util.Collection;
/*     */ import java.util.Map;
/*     */ import java.util.Set;
/*     */ import java.util.stream.Stream;
/*     */ import javax.annotation.Nullable;
/*     */ import org.apache.logging.log4j.LogManager;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public interface cfw
/*     */   extends brc, cgd
/*     */ {
/*     */   @Nullable
/*     */   ceh a(fx paramfx, ceh paramceh, boolean paramBoolean);
/*     */   
/*     */   void a(fx paramfx, ccj paramccj);
/*     */   
/*     */   void a(aqa paramaqa);
/*     */   
/*     */   @Nullable
/*     */   default cgi a() {
/*  38 */     cgi[] ☃ = d();
/*  39 */     for (int i = ☃.length - 1; i >= 0; i--) {
/*  40 */       cgi cgi = ☃[i];
/*  41 */       if (!cgi.a(cgi)) {
/*  42 */         return cgi;
/*     */       }
/*     */     } 
/*  45 */     return null;
/*     */   }
/*     */   
/*     */   default int b() {
/*  49 */     cgi ☃ = a();
/*  50 */     return (☃ == null) ? 0 : ☃.g();
/*     */   }
/*     */ 
/*     */   
/*     */   Set<fx> c();
/*     */ 
/*     */   
/*     */   cgi[] d();
/*     */ 
/*     */   
/*     */   Collection<Map.Entry<chn.a, chn>> f();
/*     */ 
/*     */   
/*     */   void a(chn.a parama, long[] paramArrayOflong);
/*     */ 
/*     */   
/*     */   chn a(chn.a parama);
/*     */   
/*     */   int a(chn.a parama, int paramInt1, int paramInt2);
/*     */   
/*     */   brd g();
/*     */   
/*     */   void a(long paramLong);
/*     */   
/*     */   Map<cla<?>, crv<?>> h();
/*     */   
/*     */   void a(Map<cla<?>, crv<?>> paramMap);
/*     */   
/*     */   default boolean a(int ☃, int i) {
/*  79 */     if (☃ < 0) {
/*  80 */       ☃ = 0;
/*     */     }
/*  82 */     if (i >= 256) {
/*  83 */       i = 255;
/*     */     }
/*  85 */     for (int j = ☃; j <= i; j += 16) {
/*  86 */       if (!cgi.a(d()[j >> 4])) {
/*  87 */         return false;
/*     */       }
/*     */     } 
/*  90 */     return true;
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   cfx i();
/*     */   
/*     */   void a(boolean paramBoolean);
/*     */   
/*     */   boolean j();
/*     */   
/*     */   cga k();
/*     */   
/*     */   void d(fx paramfx);
/*     */   
/*     */   default void e(fx ☃) {
/* 105 */     LogManager.getLogger().warn("Trying to mark a block for PostProcessing @ {}, but this operation is not supported.", ☃);
/*     */   }
/*     */   
/*     */   ShortList[] l();
/*     */   
/*     */   default void a(short ☃, int i) {
/* 111 */     a(l(), i).add(☃);
/*     */   }
/*     */   
/*     */   default void a(md ☃) {
/* 115 */     LogManager.getLogger().warn("Trying to set a BlockEntity, but this operation is not supported.");
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   md i(fx paramfx);
/*     */   
/*     */   @Nullable
/*     */   md j(fx paramfx);
/*     */   
/*     */   Stream<fx> m();
/*     */   
/*     */   bso<buo> n();
/*     */   
/*     */   bso<cuw> o();
/*     */   
/*     */   cgr p();
/*     */   
/*     */   void b(long paramLong);
/*     */   
/*     */   long q();
/*     */   
/*     */   static ShortList a(ShortList[] ☃, int i) {
/* 137 */     if (☃[i] == null) {
/* 138 */       ☃[i] = (ShortList)new ShortArrayList();
/*     */     }
/* 140 */     return ☃[i];
/*     */   }
/*     */   
/*     */   boolean r();
/*     */   
/*     */   void b(boolean paramBoolean);
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\cfw.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */