/*     */ import java.util.List;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ class null
/*     */   extends Thread
/*     */ {
/*     */   null(dhp ☃, String str) {
/*  86 */     super(str);
/*     */   }
/*     */   public void run() {
/*  89 */     dgb ☃ = dgb.a();
/*     */     try {
/*  91 */       List<dgg> list = (☃.d((dhp.a(this.a)).a)).a;
/*  92 */       dhp.b(this.a).execute(() -> {
/*     */             dhp.a(this.a, ☃);
/*     */             dhp.a(this.a, Boolean.valueOf(dhp.c(this.a).isEmpty()));
/*     */             dhp.d(this.a).a();
/*     */             for (dgg dgg : dhp.c(this.a)) {
/*     */               dhp.d(this.a).a(dgg);
/*     */             }
/*     */             dhp.e(this.a);
/*     */           });
/* 101 */     } catch (dhi dhi) {
/* 102 */       dhp.a().error("Couldn't request backups", dhi);
/*     */     } 
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dhp$1.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */