/*     */ import com.google.common.collect.Lists;
/*     */ import com.mojang.serialization.Dynamic;
/*     */ import java.util.List;
/*     */ import java.util.Random;
/*     */ import org.apache.logging.log4j.LogManager;
/*     */ import org.apache.logging.log4j.Logger;
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
/*     */ public class cro
/*     */   extends cru
/*     */ {
/*  27 */   private static final Logger d = LogManager.getLogger();
/*     */   
/*     */   protected final coi a;
/*     */   protected fx b;
/*     */   private final int e;
/*     */   protected final bzm c;
/*  33 */   private final List<cod> f = Lists.newArrayList();
/*     */   private final csw g;
/*     */   
/*     */   public cro(csw ☃, coi coi1, fx fx1, int i, bzm bzm1, cra cra1) {
/*  37 */     super(clb.ad, 0);
/*  38 */     this.g = ☃;
/*  39 */     this.a = coi1;
/*  40 */     this.b = fx1;
/*  41 */     this.e = i;
/*  42 */     this.c = bzm1;
/*  43 */     this.n = cra1;
/*     */   }
/*     */   
/*     */   public cro(csw ☃, md md1) {
/*  47 */     super(clb.ad, md1);
/*  48 */     this.g = ☃;
/*  49 */     this.b = new fx(md1.h("PosX"), md1.h("PosY"), md1.h("PosZ"));
/*  50 */     this.e = md1.h("ground_level_delta");
/*  51 */     this.a = coi.e.parse(mo.a, md1.p("pool_element")).resultOrPartial(d::error).orElse(cob.b);
/*  52 */     this.c = bzm.valueOf(md1.l("rotation"));
/*  53 */     this.n = this.a.a(☃, this.b, this.c);
/*     */     
/*  55 */     mj mj = md1.d("junctions", 10);
/*  56 */     this.f.clear();
/*  57 */     mj.forEach(☃ -> this.f.add(cod.a(new Dynamic(mo.a, ☃))));
/*     */   }
/*     */ 
/*     */   
/*     */   protected void a(md ☃) {
/*  62 */     ☃.b("PosX", this.b.u());
/*  63 */     ☃.b("PosY", this.b.v());
/*  64 */     ☃.b("PosZ", this.b.w());
/*  65 */     ☃.b("ground_level_delta", this.e);
/*  66 */     coi.e.encodeStart(mo.a, this.a).resultOrPartial(d::error).ifPresent(mt1 -> ☃.a("pool_element", mt1));
/*     */ 
/*     */     
/*  69 */     ☃.a("rotation", this.c.name());
/*  70 */     mj mj = new mj();
/*  71 */     for (cod cod : this.f) {
/*  72 */       mj.add((mt)cod.<T>a(mo.a).getValue());
/*     */     }
/*  74 */     ☃.a("junctions", mj);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(bsr ☃, bsn bsn1, cfy cfy1, Random random, cra cra1, brd brd1, fx fx1) {
/*  79 */     return a(☃, bsn1, cfy1, random, cra1, fx1, false);
/*     */   }
/*     */   
/*     */   public boolean a(bsr ☃, bsn bsn1, cfy cfy1, Random random, cra cra1, fx fx1, boolean bool) {
/*  83 */     return this.a.a(this.g, ☃, bsn1, cfy1, this.b, fx1, this.c, cra1, random, bool);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(int ☃, int i, int j) {
/*  88 */     super.a(☃, i, j);
/*  89 */     this.b = this.b.b(☃, i, j);
/*     */   }
/*     */ 
/*     */   
/*     */   public bzm ap_() {
/*  94 */     return this.c;
/*     */   }
/*     */ 
/*     */   
/*     */   public String toString() {
/*  99 */     return String.format("<%s | %s | %s | %s>", new Object[] { getClass().getSimpleName(), this.b, this.c, this.a });
/*     */   }
/*     */   
/*     */   public coi b() {
/* 103 */     return this.a;
/*     */   }
/*     */   
/*     */   public fx c() {
/* 107 */     return this.b;
/*     */   }
/*     */   
/*     */   public int d() {
/* 111 */     return this.e;
/*     */   }
/*     */   
/*     */   public void a(cod ☃) {
/* 115 */     this.f.add(☃);
/*     */   }
/*     */   
/*     */   public List<cod> e() {
/* 119 */     return this.f;
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\cro.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */