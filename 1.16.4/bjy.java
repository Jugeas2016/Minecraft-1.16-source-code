/*     */ import com.google.common.collect.ImmutableMultimap;
/*     */ import com.google.common.collect.Multimap;
/*     */ import java.util.List;
/*     */ import java.util.UUID;
/*     */ import java.util.function.Predicate;
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
/*     */ public class bjy
/*     */   extends blx
/*     */   implements bnq
/*     */ {
/*  27 */   private static final UUID[] j = new UUID[] {
/*  28 */       UUID.fromString("845DB27C-C624-495F-8C9F-6020A9A58B6B"), 
/*  29 */       UUID.fromString("D8499B04-0E66-4726-AB29-64469D734E0D"), 
/*  30 */       UUID.fromString("9F3D476D-C118-4544-8365-64846904B48E"), 
/*  31 */       UUID.fromString("2AD3F246-FEE1-4E67-B886-69FD380BB150")
/*     */     };
/*     */   
/*  34 */   public static final gw a = new gv()
/*     */     {
/*     */       protected bmb a(fy ☃, bmb bmb1) {
/*  37 */         return bjy.a(☃, bmb1) ? bmb1 : super.a(☃, bmb1);
/*     */       }
/*     */     };
/*     */   
/*     */   public static boolean a(fy ☃, bmb bmb1) {
/*  42 */     fx fx = ☃.d().a((gc)☃.e().c(bwa.a));
/*     */     
/*  44 */     List<aqm> list = ☃.h().a(aqm.class, new dci(fx), (Predicate)aqd.g.and(new aqd.a(bmb1)));
/*     */     
/*  46 */     if (list.isEmpty()) {
/*  47 */       return false;
/*     */     }
/*     */     
/*  50 */     aqm aqm = list.get(0);
/*  51 */     aqf aqf1 = aqn.j(bmb1);
/*     */     
/*  53 */     bmb bmb2 = bmb1.a(1);
/*  54 */     aqm.a(aqf1, bmb2);
/*  55 */     if (aqm instanceof aqn) {
/*  56 */       ((aqn)aqm).a(aqf1, 2.0F);
/*  57 */       ((aqn)aqm).es();
/*     */     } 
/*  59 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   protected final aqf b;
/*     */   private final int k;
/*     */   private final float l;
/*     */   protected final float c;
/*     */   protected final bjz d;
/*     */   private final Multimap<arg, arj> m;
/*     */   
/*     */   public bjy(bjz ☃, aqf aqf1, blx.a a1) {
/*  71 */     super(a1.b(☃.a(aqf1)));
/*  72 */     this.d = ☃;
/*  73 */     this.b = aqf1;
/*  74 */     this.k = ☃.b(aqf1);
/*  75 */     this.l = ☃.e();
/*  76 */     this.c = ☃.f();
/*     */     
/*  78 */     bwa.a(this, a);
/*     */     
/*  80 */     ImmutableMultimap.Builder<arg, arj> builder = ImmutableMultimap.builder();
/*     */ 
/*     */     
/*  83 */     UUID uUID = j[aqf1.b()];
/*  84 */     builder.put(arl.i, new arj(uUID, "Armor modifier", this.k, arj.a.a));
/*  85 */     builder.put(arl.j, new arj(uUID, "Armor toughness", this.l, arj.a.a));
/*     */     
/*  87 */     if (☃ == bka.g) {
/*  88 */       builder.put(arl.c, new arj(uUID, "Armor knockback resistance", this.c, arj.a.a));
/*     */     }
/*     */     
/*  91 */     this.m = (Multimap<arg, arj>)builder.build();
/*     */   }
/*     */   
/*     */   public aqf b() {
/*  95 */     return this.b;
/*     */   }
/*     */ 
/*     */   
/*     */   public int c() {
/* 100 */     return this.d.a();
/*     */   }
/*     */   
/*     */   public bjz ab_() {
/* 104 */     return this.d;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(bmb ☃, bmb bmb1) {
/* 109 */     return (this.d.c().a(bmb1) || super.a(☃, bmb1));
/*     */   }
/*     */ 
/*     */   
/*     */   public aov<bmb> a(brx ☃, bfw bfw1, aot aot1) {
/* 114 */     bmb bmb1 = bfw1.b(aot1);
/* 115 */     aqf aqf1 = aqn.j(bmb1);
/* 116 */     bmb bmb2 = bfw1.b(aqf1);
/*     */     
/* 118 */     if (bmb2.a()) {
/* 119 */       bfw1.a(aqf1, bmb1.i());
/* 120 */       bmb1.e(0);
/* 121 */       return aov.a(bmb1, ☃.s_());
/*     */     } 
/*     */     
/* 124 */     return aov.d(bmb1);
/*     */   }
/*     */ 
/*     */   
/*     */   public Multimap<arg, arj> a(aqf ☃) {
/* 129 */     if (☃ == this.b) {
/* 130 */       return this.m;
/*     */     }
/* 132 */     return super.a(☃);
/*     */   }
/*     */   
/*     */   public int e() {
/* 136 */     return this.k;
/*     */   }
/*     */   
/*     */   public float f() {
/* 140 */     return this.l;
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\bjy.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */