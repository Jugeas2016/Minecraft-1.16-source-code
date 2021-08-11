/*     */ import com.google.common.collect.ImmutableMap;
/*     */ import java.util.Map;
/*     */ import java.util.concurrent.CompletableFuture;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ final class a
/*     */ {
/*     */   private final Map<brd, String> b;
/*     */   private final CompletableFuture<Map<brd, String>> c;
/*     */   
/*     */   private a(edf paramedf, eng ☃, double d1, double d2) {
/*  83 */     dwt dwt = (edf.a(paramedf)).r;
/*  84 */     vj<brx> vj = dwt.Y();
/*  85 */     int i = (int)d1 >> 4;
/*  86 */     int j = (int)d2 >> 4;
/*     */     
/*  88 */     ImmutableMap.Builder<brd, String> builder = ImmutableMap.builder();
/*  89 */     dwr dwr = dwt.n();
/*  90 */     for (int k = i - 12; k <= i + 12; k++) {
/*  91 */       for (int m = j - 12; m <= j + 12; m++) {
/*  92 */         brd brd = new brd(k, m);
/*  93 */         String str = "";
/*  94 */         cgh cgh = dwr.a(k, m, false);
/*  95 */         str = str + "Client: ";
/*  96 */         if (cgh == null) {
/*  97 */           str = str + "0n/a\n";
/*     */         } else {
/*  99 */           str = str + (cgh.t() ? " E" : "");
/* 100 */           str = str + "\n";
/*     */         } 
/* 102 */         builder.put(brd, str);
/*     */       } 
/*     */     } 
/* 105 */     this.b = (Map<brd, String>)builder.build();
/* 106 */     this.c = ☃.a(() -> {
/*     */           aag aag = ☃.a(vj1);
/*     */           if (aag == null)
/*     */             return (Map)ImmutableMap.of(); 
/*     */           ImmutableMap.Builder<brd, String> builder = ImmutableMap.builder();
/*     */           aae aae = aag.i();
/*     */           for (int k = i - 12; k <= i + 12; k++) {
/*     */             for (int m = j - 12; m <= j + 12; m++) {
/*     */               brd brd = new brd(k, m);
/*     */               builder.put(brd, "Server: " + aae.b(brd));
/*     */             } 
/*     */           } 
/*     */           return (Map)builder.build();
/*     */         });
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\edf$a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */