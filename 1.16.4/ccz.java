/*     */ import com.google.common.collect.Lists;
/*     */ import java.util.Arrays;
/*     */ import java.util.List;
/*     */ import java.util.Optional;
/*     */ import java.util.Random;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class ccz
/*     */   extends ccj
/*     */ {
/*     */   public enum a
/*     */     implements afs
/*     */   {
/*  33 */     a("rollable"),
/*  34 */     b("aligned");
/*     */     
/*     */     private final String c;
/*     */     
/*     */     a(String ☃) {
/*  39 */       this.c = ☃;
/*     */     }
/*     */ 
/*     */     
/*     */     public String a() {
/*  44 */       return this.c;
/*     */     }
/*     */     
/*     */     public static Optional<a> a(String ☃) {
/*  48 */       return Arrays.<a>stream(values()).filter(a1 -> a1.a().equals(☃)).findFirst();
/*     */     }
/*     */   }
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
/*  63 */   private vk a = new vk("empty");
/*  64 */   private vk b = new vk("empty");
/*  65 */   private vk c = new vk("empty");
/*  66 */   private a g = a.a;
/*  67 */   private String h = "minecraft:air";
/*     */   
/*     */   public ccz(cck<?> ☃) {
/*  70 */     super(☃);
/*     */   }
/*     */   
/*     */   public ccz() {
/*  74 */     this(cck.E);
/*     */   }
/*     */   
/*     */   public vk d() {
/*  78 */     return this.a;
/*     */   }
/*     */   
/*     */   public vk f() {
/*  82 */     return this.b;
/*     */   }
/*     */   
/*     */   public vk g() {
/*  86 */     return this.c;
/*     */   }
/*     */   
/*     */   public String h() {
/*  90 */     return this.h;
/*     */   }
/*     */   
/*     */   public a j() {
/*  94 */     return this.g;
/*     */   }
/*     */   
/*     */   public void a(vk ☃) {
/*  98 */     this.a = ☃;
/*     */   }
/*     */   
/*     */   public void b(vk ☃) {
/* 102 */     this.b = ☃;
/*     */   }
/*     */   
/*     */   public void c(vk ☃) {
/* 106 */     this.c = ☃;
/*     */   }
/*     */   
/*     */   public void a(String ☃) {
/* 110 */     this.h = ☃;
/*     */   }
/*     */   
/*     */   public void a(a ☃) {
/* 114 */     this.g = ☃;
/*     */   }
/*     */ 
/*     */   
/*     */   public md a(md ☃) {
/* 119 */     super.a(☃);
/* 120 */     ☃.a("name", this.a.toString());
/* 121 */     ☃.a("target", this.b.toString());
/* 122 */     ☃.a("pool", this.c.toString());
/* 123 */     ☃.a("final_state", this.h);
/* 124 */     ☃.a("joint", this.g.a());
/* 125 */     return ☃;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(ceh ☃, md md1) {
/* 130 */     super.a(☃, md1);
/* 131 */     this.a = new vk(md1.l("name"));
/* 132 */     this.b = new vk(md1.l("target"));
/* 133 */     this.c = new vk(md1.l("pool"));
/* 134 */     this.h = md1.l("final_state");
/* 135 */     this
/* 136 */       .g = a.a(md1.l("joint")).orElseGet(() -> bxr.h(☃).n().d() ? a.b : a.a);
/*     */   }
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   public ow a() {
/* 142 */     return new ow(this.e, 12, b());
/*     */   }
/*     */ 
/*     */   
/*     */   public md b() {
/* 147 */     return a(new md());
/*     */   }
/*     */   
/*     */   public void a(aag ☃, int i, boolean bool) {
/* 151 */     cfy cfy = ☃.i().g();
/* 152 */     csw csw = ☃.n();
/* 153 */     bsn bsn = ☃.a();
/* 154 */     Random random = ☃.u_();
/* 155 */     fx fx = o();
/*     */     
/* 157 */     List<cro> list = Lists.newArrayList();
/*     */     
/* 159 */     ctb ctb = new ctb();
/* 160 */     ctb.a(☃, fx, new fx(1, 1, 1), false, (buo)null);
/*     */     
/* 162 */     coi coi = new coh(ctb);
/* 163 */     cro cro = new cro(csw, coi, fx, 1, bzm.a, new cra(fx, fx));
/*     */     
/* 165 */     coe.a(☃.r(), cro, i, cro::new, cfy, csw, list, random);
/*     */     
/* 167 */     for (cro cro1 : list)
/* 168 */       cro1.a(☃, bsn, cfy, random, cra.b(), fx, bool); 
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\ccz.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */