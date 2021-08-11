/*     */ import com.google.common.collect.ImmutableMap;
/*     */ import com.mojang.blaze3d.systems.RenderSystem;
/*     */ import java.util.Map;
/*     */ import java.util.concurrent.CompletableFuture;
/*     */ import javax.annotation.Nullable;
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
/*     */ public class edf
/*     */   implements edh.a
/*     */ {
/*     */   private final djz a;
/*  25 */   private double b = Double.MIN_VALUE;
/*  26 */   private final int c = 12;
/*     */   @Nullable
/*     */   private a d;
/*     */   
/*     */   public edf(djz ☃) {
/*  31 */     this.a = ☃;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(dfm ☃, eag eag1, double d1, double d2, double d3) {
/*  36 */     double d = x.c();
/*  37 */     if (d - this.b > 3.0E9D) {
/*  38 */       this.b = d;
/*     */       
/*  40 */       eng eng = this.a.H();
/*     */       
/*  42 */       if (eng != null) {
/*  43 */         this.d = new a(eng, d1, d3);
/*     */       } else {
/*  45 */         this.d = null;
/*     */       } 
/*     */     } 
/*     */     
/*  49 */     if (this.d != null) {
/*  50 */       RenderSystem.enableBlend();
/*  51 */       RenderSystem.defaultBlendFunc();
/*  52 */       RenderSystem.lineWidth(2.0F);
/*  53 */       RenderSystem.disableTexture();
/*  54 */       RenderSystem.depthMask(false);
/*     */       
/*  56 */       Map<brd, String> map = a.a(this.d).getNow(null);
/*  57 */       double d4 = (this.a.h.k().b()).c * 0.85D;
/*  58 */       for (Map.Entry<brd, String> entry : (Iterable<Map.Entry<brd, String>>)a.b(this.d).entrySet()) {
/*  59 */         brd brd = entry.getKey();
/*  60 */         String str = entry.getValue();
/*  61 */         if (map != null) {
/*  62 */           str = str + (String)map.get(brd);
/*     */         }
/*  64 */         String[] arrayOfString = str.split("\n");
/*  65 */         int i = 0;
/*  66 */         for (String str1 : arrayOfString) {
/*  67 */           edh.a(str1, ((brd.b << 4) + 8), d4 + i, ((brd.c << 4) + 8), -1, 0.15F);
/*  68 */           i -= 2;
/*     */         } 
/*     */       } 
/*     */       
/*  72 */       RenderSystem.depthMask(true);
/*  73 */       RenderSystem.enableTexture();
/*  74 */       RenderSystem.disableBlend();
/*     */     } 
/*     */   }
/*     */   
/*     */   final class a {
/*     */     private final Map<brd, String> b;
/*     */     private final CompletableFuture<Map<brd, String>> c;
/*     */     
/*     */     private a(edf this$0, eng ☃, double d1, double d2) {
/*  83 */       dwt dwt = (edf.a(edf.this)).r;
/*  84 */       vj<brx> vj = dwt.Y();
/*  85 */       int i = (int)d1 >> 4;
/*  86 */       int j = (int)d2 >> 4;
/*     */       
/*  88 */       ImmutableMap.Builder<brd, String> builder = ImmutableMap.builder();
/*  89 */       dwr dwr = dwt.n();
/*  90 */       for (int k = i - 12; k <= i + 12; k++) {
/*  91 */         for (int m = j - 12; m <= j + 12; m++) {
/*  92 */           brd brd = new brd(k, m);
/*  93 */           String str = "";
/*  94 */           cgh cgh = dwr.a(k, m, false);
/*  95 */           str = str + "Client: ";
/*  96 */           if (cgh == null) {
/*  97 */             str = str + "0n/a\n";
/*     */           } else {
/*  99 */             str = str + (cgh.t() ? " E" : "");
/* 100 */             str = str + "\n";
/*     */           } 
/* 102 */           builder.put(brd, str);
/*     */         } 
/*     */       } 
/* 105 */       this.b = (Map<brd, String>)builder.build();
/* 106 */       this.c = ☃.a(() -> {
/*     */             aag aag = ☃.a(vj1);
/*     */             if (aag == null)
/*     */               return (Map)ImmutableMap.of(); 
/*     */             ImmutableMap.Builder<brd, String> builder = ImmutableMap.builder();
/*     */             aae aae = aag.i();
/*     */             for (int k = i - 12; k <= i + 12; k++) {
/*     */               for (int m = j - 12; m <= j + 12; m++) {
/*     */                 brd brd = new brd(k, m);
/*     */                 builder.put(brd, "Server: " + aae.b(brd));
/*     */               } 
/*     */             } 
/*     */             return (Map)builder.build();
/*     */           });
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\edf.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */