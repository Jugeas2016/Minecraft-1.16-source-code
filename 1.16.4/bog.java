/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class bog
/*     */   extends boj
/*     */ {
/*     */   public bog(vk ☃) {
/*  14 */     super(☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(bio ☃, brx brx1) {
/*  19 */     int i = 0;
/*  20 */     bmb bmb = bmb.b;
/*     */     
/*  22 */     for (int j = 0; j < ☃.Z_(); j++) {
/*  23 */       bmb bmb1 = ☃.a(j);
/*  24 */       if (!bmb1.a())
/*     */       {
/*     */ 
/*     */         
/*  28 */         if (bmb1.b() == bmd.oU) {
/*  29 */           if (!bmb.a()) {
/*  30 */             return false;
/*     */           }
/*  32 */           bmb = bmb1;
/*  33 */         } else if (bmb1.b() == bmd.oT) {
/*  34 */           i++;
/*     */         } else {
/*  36 */           return false;
/*     */         } 
/*     */       }
/*     */     } 
/*  40 */     return (!bmb.a() && bmb.n() && i > 0);
/*     */   }
/*     */ 
/*     */   
/*     */   public bmb a(bio ☃) {
/*  45 */     int i = 0;
/*  46 */     bmb bmb1 = bmb.b;
/*     */     
/*  48 */     for (int j = 0; j < ☃.Z_(); j++) {
/*  49 */       bmb bmb = ☃.a(j);
/*  50 */       if (!bmb.a())
/*     */       {
/*     */ 
/*     */         
/*  54 */         if (bmb.b() == bmd.oU) {
/*  55 */           if (!bmb1.a()) {
/*  56 */             return bmb.b;
/*     */           }
/*  58 */           bmb1 = bmb;
/*  59 */         } else if (bmb.b() == bmd.oT) {
/*  60 */           i++;
/*     */         } else {
/*  62 */           return bmb.b;
/*     */         } 
/*     */       }
/*     */     } 
/*  66 */     if (bmb1.a() || !bmb1.n() || i < 1 || bns.d(bmb1) >= 2) {
/*  67 */       return bmb.b;
/*     */     }
/*     */     
/*  70 */     bmb bmb2 = new bmb(bmd.oU, i);
/*     */     
/*  72 */     md md = bmb1.o().g();
/*     */     
/*  74 */     md.b("generation", bns.d(bmb1) + 1);
/*  75 */     bmb2.c(md);
/*     */     
/*  77 */     return bmb2;
/*     */   }
/*     */ 
/*     */   
/*     */   public gj<bmb> b(bio ☃) {
/*  82 */     gj<bmb> gj = gj.a(☃.Z_(), bmb.b);
/*     */     
/*  84 */     for (int i = 0; i < gj.size(); i++) {
/*  85 */       bmb bmb = ☃.a(i);
/*  86 */       if (bmb.b().p()) {
/*  87 */         gj.set(i, new bmb(bmb.b().o()));
/*  88 */       } else if (bmb.b() instanceof bns) {
/*  89 */         bmb bmb1 = bmb.i();
/*  90 */         bmb1.e(1);
/*  91 */         gj.set(i, bmb1);
/*     */         
/*     */         break;
/*     */       } 
/*     */     } 
/*  96 */     return gj;
/*     */   }
/*     */ 
/*     */   
/*     */   public bos<?> ag_() {
/* 101 */     return bos.d;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(int ☃, int i) {
/* 106 */     return (☃ >= 3 && i >= 3);
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\bog.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */