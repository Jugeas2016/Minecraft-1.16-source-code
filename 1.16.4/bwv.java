/*     */ import com.google.common.collect.Maps;
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
/*     */ public class bwv
/*     */   extends buo
/*     */ {
/*  25 */   private static final Map<buo, buo> b = Maps.newHashMap();
/*     */ 
/*     */   
/*  28 */   protected static final ddh a = buo.a(5.0D, 0.0D, 5.0D, 11.0D, 6.0D, 11.0D);
/*     */   
/*     */   private final buo c;
/*     */   
/*     */   public bwv(buo ☃, ceg.c c1) {
/*  33 */     super(c1);
/*  34 */     this.c = ☃;
/*     */     
/*  36 */     b.put(☃, this);
/*     */   }
/*     */ 
/*     */   
/*     */   public ddh b(ceh ☃, brc brc1, fx fx1, dcs dcs1) {
/*  41 */     return a;
/*     */   }
/*     */ 
/*     */   
/*     */   public bzh b(ceh ☃) {
/*  46 */     return bzh.c;
/*     */   }
/*     */ 
/*     */   
/*     */   public aou a(ceh ☃, brx brx1, fx fx1, bfw bfw1, aot aot1, dcj dcj1) {
/*  51 */     bmb bmb = bfw1.b(aot1);
/*     */     
/*  53 */     blx blx = bmb.b();
/*  54 */     buo buo1 = (blx instanceof bkh) ? b.getOrDefault(((bkh)blx).e(), bup.a) : bup.a;
/*  55 */     boolean bool1 = (buo1 == bup.a);
/*  56 */     boolean bool2 = (this.c == bup.a);
/*     */     
/*  58 */     if (bool1 != bool2) {
/*  59 */       if (bool2) {
/*  60 */         brx1.a(fx1, buo1.n(), 3);
/*  61 */         bfw1.a(aea.ag);
/*     */         
/*  63 */         if (!bfw1.bC.d) {
/*  64 */           bmb.g(1);
/*     */         }
/*     */       } else {
/*  67 */         bmb bmb1 = new bmb(this.c);
/*  68 */         if (bmb.a()) {
/*  69 */           bfw1.a(aot1, bmb1);
/*  70 */         } else if (!bfw1.g(bmb1)) {
/*  71 */           bfw1.a(bmb1, false);
/*     */         } 
/*  73 */         brx1.a(fx1, bup.ev.n(), 3);
/*     */       } 
/*  75 */       return aou.a(brx1.v);
/*     */     } 
/*     */     
/*  78 */     return aou.b;
/*     */   }
/*     */ 
/*     */   
/*     */   public bmb a(brc ☃, fx fx1, ceh ceh1) {
/*  83 */     if (this.c == bup.a) {
/*  84 */       return super.a(☃, fx1, ceh1);
/*     */     }
/*  86 */     return new bmb(this.c);
/*     */   }
/*     */ 
/*     */   
/*     */   public ceh a(ceh ☃, gc gc1, ceh ceh1, bry bry1, fx fx1, fx fx2) {
/*  91 */     if (gc1 == gc.a && !☃.a(bry1, fx1)) {
/*  92 */       return bup.a.n();
/*     */     }
/*     */     
/*  95 */     return super.a(☃, gc1, ceh1, bry1, fx1, fx2);
/*     */   }
/*     */   
/*     */   public buo c() {
/*  99 */     return this.c;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(ceh ☃, brc brc1, fx fx1, cxe cxe1) {
/* 104 */     return false;
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\bwv.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */