/*     */ import com.google.common.collect.Lists;
/*     */ import com.mojang.blaze3d.systems.RenderSystem;
/*     */ import java.util.Iterator;
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
/*     */ public class dmb
/*     */   extends dkw
/*     */   implements ent
/*     */ {
/*     */   private final djz a;
/*  23 */   private final List<a> b = Lists.newArrayList();
/*     */   private boolean c;
/*     */   
/*     */   public dmb(djz ☃) {
/*  27 */     this.a = ☃;
/*     */   }
/*     */   
/*     */   public void a(dfm ☃) {
/*  31 */     if (!this.c && this.a.k.W) {
/*  32 */       this.a.W().a(this);
/*  33 */       this.c = true;
/*  34 */     } else if (this.c && !this.a.k.W) {
/*  35 */       this.a.W().b(this);
/*  36 */       this.c = false;
/*     */     } 
/*     */     
/*  39 */     if (!this.c || this.b.isEmpty()) {
/*     */       return;
/*     */     }
/*     */     
/*  43 */     RenderSystem.pushMatrix();
/*  44 */     RenderSystem.enableBlend();
/*  45 */     RenderSystem.defaultBlendFunc();
/*     */     
/*  47 */     dcn dcn1 = new dcn(this.a.s.cD(), this.a.s.cG(), this.a.s.cH());
/*  48 */     dcn dcn2 = (new dcn(0.0D, 0.0D, -1.0D)).a(-this.a.s.q * 0.017453292F).b(-this.a.s.p * 0.017453292F);
/*  49 */     dcn dcn3 = (new dcn(0.0D, 1.0D, 0.0D)).a(-this.a.s.q * 0.017453292F).b(-this.a.s.p * 0.017453292F);
/*  50 */     dcn dcn4 = dcn2.c(dcn3);
/*  51 */     int i = 0;
/*  52 */     int j = 0;
/*     */     Iterator<a> iterator;
/*  54 */     for (iterator = this.b.iterator(); iterator.hasNext(); ) {
/*  55 */       a a = iterator.next();
/*  56 */       if (a.b() + 3000L <= x.b()) {
/*  57 */         iterator.remove(); continue;
/*     */       } 
/*  59 */       j = Math.max(j, this.a.g.a(a.a()));
/*     */     } 
/*     */ 
/*     */     
/*  63 */     j += this.a.g.b("<") + this.a.g.b(" ") + this.a.g.b(">") + this.a.g.b(" ");
/*     */     
/*  65 */     for (iterator = this.b.iterator(); iterator.hasNext(); ) { a a = iterator.next();
/*  66 */       int k = 255;
/*  67 */       nr nr = a.a();
/*     */       
/*  69 */       dcn dcn = a.c().d(dcn1).d();
/*  70 */       double d1 = -dcn4.b(dcn);
/*  71 */       double d2 = -dcn2.b(dcn);
/*  72 */       boolean bool = (d2 > 0.5D);
/*     */       
/*  74 */       int m = j / 2;
/*  75 */       this.a.g.getClass(); int n = 9;
/*  76 */       int i1 = n / 2;
/*  77 */       float f = 1.0F;
/*  78 */       int i2 = this.a.g.a(nr);
/*  79 */       int i3 = afm.c(afm.b(255.0D, 75.0D, ((float)(x.b() - a.b()) / 3000.0F)));
/*  80 */       int i4 = i3 << 16 | i3 << 8 | i3;
/*     */       
/*  82 */       RenderSystem.pushMatrix();
/*  83 */       RenderSystem.translatef(this.a.aD().o() - m * 1.0F - 2.0F, (this.a.aD().p() - 30) - (i * (n + 1)) * 1.0F, 0.0F);
/*  84 */       RenderSystem.scalef(1.0F, 1.0F, 1.0F);
/*  85 */       a(☃, -m - 1, -i1 - 1, m + 1, i1 + 1, this.a.k.b(0.8F));
/*  86 */       RenderSystem.enableBlend();
/*     */       
/*  88 */       if (!bool) {
/*  89 */         if (d1 > 0.0D) {
/*  90 */           this.a.g.b(☃, ">", (m - this.a.g.b(">")), -i1, i4 + -16777216);
/*  91 */         } else if (d1 < 0.0D) {
/*  92 */           this.a.g.b(☃, "<", -m, -i1, i4 + -16777216);
/*     */         } 
/*     */       }
/*     */       
/*  96 */       this.a.g.b(☃, nr, (-i2 / 2), -i1, i4 + -16777216);
/*     */       
/*  98 */       RenderSystem.popMatrix();
/*  99 */       i++; }
/*     */ 
/*     */     
/* 102 */     RenderSystem.disableBlend();
/* 103 */     RenderSystem.popMatrix();
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(emt ☃, env env1) {
/* 108 */     if (env1.c() == null) {
/*     */       return;
/*     */     }
/* 111 */     nr nr = env1.c();
/* 112 */     if (!this.b.isEmpty()) {
/* 113 */       for (a a : this.b) {
/* 114 */         if (a.a().equals(nr)) {
/* 115 */           a.a(new dcn(☃.h(), ☃.i(), ☃.j()));
/*     */           
/*     */           return;
/*     */         } 
/*     */       } 
/*     */     }
/* 121 */     this.b.add(new a(this, nr, new dcn(☃.h(), ☃.i(), ☃.j())));
/*     */   }
/*     */   
/*     */   public class a {
/*     */     private final nr b;
/*     */     private long c;
/*     */     private dcn d;
/*     */     
/*     */     public a(dmb ☃, nr nr1, dcn dcn1) {
/* 130 */       this.b = nr1;
/* 131 */       this.d = dcn1;
/* 132 */       this.c = x.b();
/*     */     }
/*     */     
/*     */     public nr a() {
/* 136 */       return this.b;
/*     */     }
/*     */     
/*     */     public long b() {
/* 140 */       return this.c;
/*     */     }
/*     */     
/*     */     public dcn c() {
/* 144 */       return this.d;
/*     */     }
/*     */     
/*     */     public void a(dcn ☃) {
/* 148 */       this.d = ☃;
/* 149 */       this.c = x.b();
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dmb.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */