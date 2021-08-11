/*     */ import java.util.Comparator;
/*     */ import java.util.Map;
/*     */ import java.util.Objects;
/*     */ import java.util.function.Consumer;
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
/*     */ public class dnu
/*     */   extends dot
/*     */ {
/*  25 */   private static final nr a = new of("createWorld.customize.buffet.biome");
/*     */   
/*     */   private final dot b;
/*     */   
/*     */   private final Consumer<bsv> c;
/*     */   private final gs<bsv> p;
/*     */   private a q;
/*     */   private bsv r;
/*     */   private dlj s;
/*     */   
/*     */   public dnu(dot ☃, gn gn1, Consumer<bsv> consumer, bsv bsv1) {
/*  36 */     super(new of("createWorld.customize.buffet.title"));
/*  37 */     this.b = ☃;
/*  38 */     this.c = consumer;
/*     */     
/*  40 */     this.r = bsv1;
/*  41 */     this.p = gn1.b(gm.ay);
/*     */   }
/*     */ 
/*     */   
/*     */   public void at_() {
/*  46 */     this.i.a(this.b);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void b() {
/*  51 */     this.i.m.a(true);
/*     */     
/*  53 */     this.q = new a();
/*  54 */     this.e.add(this.q);
/*     */     
/*  56 */     this.s = a(new dlj(this.k / 2 - 155, this.l - 28, 150, 20, nq.c, ☃ -> {
/*     */             this.c.accept(this.r);
/*     */             
/*     */             this.i.a(this.b);
/*     */           }));
/*  61 */     a(new dlj(this.k / 2 + 5, this.l - 28, 150, 20, nq.d, ☃ -> this.i.a(this.b)));
/*     */     
/*  63 */     this.q.a(this.q.au_().stream().filter(☃ -> Objects.equals(a.a.a(☃), this.r)).findFirst().orElse(null));
/*     */   }
/*     */   
/*     */   private void h() {
/*  67 */     this.s.o = (this.q.h() != null);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(dfm ☃, int i, int j, float f) {
/*  72 */     e(0);
/*  73 */     this.q.a(☃, i, j, f);
/*  74 */     a(☃, this.o, this.d, this.k / 2, 8, 16777215);
/*  75 */     a(☃, this.o, a, this.k / 2, 28, 10526880);
/*  76 */     super.a(☃, i, j, f);
/*     */   }
/*     */   
/*     */   class a extends dlv<a.a> {
/*     */     private a(dnu this$0) {
/*  81 */       super(dnu.this.i, dnu.this.k, dnu.this.l, 40, dnu.this.l - 37, 16);
/*     */       
/*  83 */       dnu.a(dnu.this).d().stream().sorted(Comparator.comparing(☃ -> ((vj)☃.getKey()).a().toString())).forEach(☃ -> b(new a(this, (bsv)☃.getValue())));
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     protected boolean b() {
/*  90 */       return (this.a.aw_() == this);
/*     */     }
/*     */ 
/*     */     
/*     */     public void a(@Nullable a ☃) {
/*  95 */       super.a(☃);
/*     */       
/*  97 */       if (☃ != null) {
/*  98 */         dnu.a(this.a, a.a(☃));
/*  99 */         dkz.b.a((new of("narrator.select", new Object[] { dnu.a(this.a).b(a.a(☃)) })).getString());
/*     */       } 
/* 101 */       dnu.b(this.a);
/*     */     }
/*     */     
/*     */     class a extends dlv.a<a> {
/*     */       private final bsv b;
/*     */       private final nr c;
/*     */       
/*     */       public a(dnu.a this$0, bsv ☃) {
/* 109 */         this.b = ☃;
/* 110 */         vk vk = dnu.a(this$0.a).b(☃);
/*     */         
/* 112 */         String str = "biome." + vk.b() + "." + vk.a();
/* 113 */         if (ly.a().b(str)) {
/* 114 */           this.c = new of(str);
/*     */         } else {
/* 116 */           this.c = new oe(vk.toString());
/*     */         } 
/*     */       }
/*     */ 
/*     */       
/*     */       public void a(dfm ☃, int i, int j, int k, int m, int n, int i1, int i2, boolean bool, float f) {
/* 122 */         dkw.b(☃, this.a.a.o, this.c, k + 5, j + 2, 16777215);
/*     */       }
/*     */       
/*     */       public boolean a(double ☃, double d1, int i)
/*     */       {
/* 127 */         if (i == 0) {
/*     */ 
/*     */           
/* 130 */           this.a.a(this);
/* 131 */           return true;
/*     */         } 
/* 133 */         return false; } } } class a extends dlv.a<a.a> { public boolean a(double ☃, double d1, int i) { if (i == 0) { this.a.a(this); return true; }  return false; }
/*     */ 
/*     */     
/*     */     private final bsv b;
/*     */     private final nr c;
/*     */     
/*     */     public a(dnu this$0, bsv ☃) {
/*     */       this.b = ☃;
/*     */       vk vk = dnu.a(((dnu.a)this$0).a).b(☃);
/*     */       String str = "biome." + vk.b() + "." + vk.a();
/*     */       if (ly.a().b(str)) {
/*     */         this.c = new of(str);
/*     */       } else {
/*     */         this.c = new oe(vk.toString());
/*     */       } 
/*     */     }
/*     */     
/*     */     public void a(dfm ☃, int i, int j, int k, int m, int n, int i1, int i2, boolean bool, float f) {
/*     */       dkw.b(☃, this.a.a.o, this.c, k + 5, j + 2, 16777215);
/*     */     } }
/*     */ 
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dnu.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */