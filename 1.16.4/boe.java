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
/*     */ public class boe
/*     */   extends boj
/*     */ {
/*     */   public boe(vk ☃) {
/*  15 */     super(☃);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean a(bio ☃, brx brx1) {
/*  21 */     bkx bkx = null;
/*  22 */     bmb bmb1 = null;
/*  23 */     bmb bmb2 = null;
/*     */     
/*  25 */     for (int i = 0; i < ☃.Z_(); i++) {
/*  26 */       bmb bmb = ☃.a(i);
/*  27 */       blx blx = bmb.b();
/*  28 */       if (blx instanceof bke) {
/*     */ 
/*     */ 
/*     */         
/*  32 */         bke bke = (bke)blx;
/*     */         
/*  34 */         if (bkx == null) {
/*  35 */           bkx = bke.b();
/*  36 */         } else if (bkx != bke.b()) {
/*  37 */           return false;
/*     */         } 
/*     */         
/*  40 */         int j = cca.b(bmb);
/*  41 */         if (j > 6) {
/*  42 */           return false;
/*     */         }
/*     */         
/*  45 */         if (j > 0) {
/*  46 */           if (bmb1 == null) {
/*  47 */             bmb1 = bmb;
/*     */           } else {
/*  49 */             return false;
/*     */           }
/*     */         
/*  52 */         } else if (bmb2 == null) {
/*  53 */           bmb2 = bmb;
/*     */         } else {
/*  55 */           return false;
/*     */         } 
/*     */       } 
/*     */     } 
/*     */     
/*  60 */     return (bmb1 != null && bmb2 != null);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public bmb a(bio ☃) {
/*  66 */     for (int i = 0; i < ☃.Z_(); i++) {
/*  67 */       bmb bmb = ☃.a(i);
/*  68 */       if (!bmb.a()) {
/*     */ 
/*     */         
/*  71 */         int j = cca.b(bmb);
/*  72 */         if (j > 0 && j <= 6) {
/*  73 */           bmb bmb1 = bmb.i();
/*  74 */           bmb1.e(1);
/*  75 */           return bmb1;
/*     */         } 
/*     */       } 
/*     */     } 
/*  79 */     return bmb.b;
/*     */   }
/*     */ 
/*     */   
/*     */   public gj<bmb> b(bio ☃) {
/*  84 */     gj<bmb> gj = gj.a(☃.Z_(), bmb.b);
/*     */     
/*  86 */     for (int i = 0; i < gj.size(); i++) {
/*  87 */       bmb bmb = ☃.a(i);
/*  88 */       if (!bmb.a()) {
/*  89 */         if (bmb.b().p()) {
/*  90 */           gj.set(i, new bmb(bmb.b().o()));
/*  91 */         } else if (bmb.n() && 
/*  92 */           cca.b(bmb) > 0) {
/*  93 */           bmb bmb1 = bmb.i();
/*  94 */           bmb1.e(1);
/*  95 */           gj.set(i, bmb1);
/*     */         } 
/*     */       }
/*     */     } 
/*     */ 
/*     */     
/* 101 */     return gj;
/*     */   }
/*     */ 
/*     */   
/*     */   public bos<?> ag_() {
/* 106 */     return bos.k;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(int ☃, int i) {
/* 111 */     return (☃ * i >= 2);
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\boe.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */