/*     */ import java.util.Map;
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
/*     */   extends bjr
/*     */ {
/*     */   null(biw ☃, aon aon1, int i, int j, int k, bim parambim) {
/*  62 */     super(aon1, i, j, k);
/*     */   }
/*     */   public boolean a(bmb ☃) {
/*  65 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public bmb a(bfw ☃, bmb bmb1) {
/*  70 */     this.a.a((☃, fx1) -> {
/*     */           int i = a(☃);
/*     */           
/*     */           while (i > 0) {
/*     */             int j = aqg.a(i);
/*     */             i -= j;
/*     */             ☃.c(new aqg(☃, fx1.u(), fx1.v() + 0.5D, fx1.w() + 0.5D, j));
/*     */           } 
/*     */           ☃.c(1042, fx1, 0);
/*     */         });
/*  80 */     biw.a(this.b).a(0, bmb.b);
/*  81 */     biw.a(this.b).a(1, bmb.b);
/*     */     
/*  83 */     return bmb1;
/*     */   }
/*     */   
/*     */   private int a(brx ☃) {
/*  87 */     int i = 0;
/*  88 */     i += e(biw.a(this.b).a(0));
/*  89 */     i += e(biw.a(this.b).a(1));
/*     */     
/*  91 */     if (i > 0) {
/*  92 */       int j = (int)Math.ceil(i / 2.0D);
/*  93 */       return j + ☃.t.nextInt(j);
/*     */     } 
/*     */     
/*  96 */     return 0;
/*     */   }
/*     */   
/*     */   private int e(bmb ☃) {
/* 100 */     int i = 0;
/* 101 */     Map<bps, Integer> map = bpu.a(☃);
/* 102 */     for (Map.Entry<bps, Integer> entry : map.entrySet()) {
/* 103 */       bps bps = entry.getKey();
/* 104 */       Integer integer = entry.getValue();
/*     */       
/* 106 */       if (!bps.c()) {
/* 107 */         i += bps.a(integer.intValue());
/*     */       }
/*     */     } 
/*     */     
/* 111 */     return i;
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\biw$4.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */