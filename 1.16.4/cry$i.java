/*     */ import java.util.Random;
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
/*     */ public class i
/*     */   extends crx
/*     */ {
/*     */   private final String d;
/*     */   private final bzm e;
/*     */   private final byg f;
/*     */   
/*     */   public i(csw ☃, String str, fx fx1, bzm bzm1) {
/*  39 */     this(☃, str, fx1, bzm1, byg.a);
/*     */   }
/*     */   
/*     */   public i(csw ☃, String str, fx fx1, bzm bzm1, byg byg1) {
/*  43 */     super(clb.Z, 0);
/*     */     
/*  45 */     this.d = str;
/*  46 */     this.c = fx1;
/*  47 */     this.e = bzm1;
/*  48 */     this.f = byg1;
/*     */     
/*  50 */     a(☃);
/*     */   }
/*     */   
/*     */   public i(csw ☃, md md1) {
/*  54 */     super(clb.Z, md1);
/*     */     
/*  56 */     this.d = md1.l("Template");
/*  57 */     this.e = bzm.valueOf(md1.l("Rot"));
/*  58 */     this.f = byg.valueOf(md1.l("Mi"));
/*     */     
/*  60 */     a(☃);
/*     */   }
/*     */   
/*     */   private void a(csw ☃) {
/*  64 */     ctb ctb = ☃.a(new vk("woodland_mansion/" + this.d));
/*  65 */     csx csx = (new csx()).a(true).a(this.e).a(this.f).a(cse.b);
/*     */     
/*  67 */     a(ctb, this.c, csx);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void a(md ☃) {
/*  72 */     super.a(☃);
/*     */     
/*  74 */     ☃.a("Template", this.d);
/*  75 */     ☃.a("Rot", this.b.d().name());
/*  76 */     ☃.a("Mi", this.b.c().name());
/*     */   }
/*     */ 
/*     */   
/*     */   protected void a(String ☃, fx fx1, bsk bsk1, Random random, cra cra1) {
/*  81 */     if (☃.startsWith("Chest")) {
/*  82 */       bzm bzm1 = this.b.d();
/*  83 */       ceh ceh = bup.bR.n();
/*  84 */       if ("ChestWest".equals(☃)) {
/*  85 */         ceh = ceh.a(bve.b, bzm1.a(gc.e));
/*  86 */       } else if ("ChestEast".equals(☃)) {
/*  87 */         ceh = ceh.a(bve.b, bzm1.a(gc.f));
/*  88 */       } else if ("ChestSouth".equals(☃)) {
/*  89 */         ceh = ceh.a(bve.b, bzm1.a(gc.d));
/*  90 */       } else if ("ChestNorth".equals(☃)) {
/*  91 */         ceh = ceh.a(bve.b, bzm1.a(gc.c));
/*     */       } 
/*  93 */       a(bsk1, cra1, random, fx1, cyq.D, ceh);
/*     */     } else {
/*     */       bcy bcy;
/*  96 */       switch (☃) {
/*     */         case "Mage":
/*  98 */           bcy = aqe.w.a(bsk1.E());
/*     */           break;
/*     */         case "Warrior":
/* 101 */           bcy = aqe.aQ.a(bsk1.E());
/*     */           break;
/*     */         
/*     */         default:
/*     */           return;
/*     */       } 
/* 107 */       bcy.es();
/* 108 */       bcy.a(fx1, 0.0F, 0.0F);
/* 109 */       bcy.a(bsk1, bsk1.d(bcy.cB()), aqp.d, (arc)null, (md)null);
/* 110 */       bsk1.l(bcy);
/* 111 */       bsk1.a(fx1, bup.a.n(), 2);
/*     */     } 
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\cry$i.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */