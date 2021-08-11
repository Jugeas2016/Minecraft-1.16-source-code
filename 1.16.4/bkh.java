/*     */ import java.util.List;
/*     */ import java.util.Map;
/*     */ import javax.annotation.Nullable;
/*     */ import net.minecraft.server.MinecraftServer;
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
/*     */ public class bkh
/*     */   extends blx
/*     */ {
/*     */   @Deprecated
/*     */   private final buo a;
/*     */   
/*     */   public bkh(buo ☃, blx.a a1) {
/*  37 */     super(a1);
/*  38 */     this.a = ☃;
/*     */   }
/*     */ 
/*     */   
/*     */   public aou a(boa ☃) {
/*  43 */     aou aou = a(new bny(☃));
/*     */     
/*  45 */     if (!aou.a() && 
/*  46 */       s()) {
/*  47 */       return a(☃.p(), ☃.n(), ☃.o()).a();
/*     */     }
/*     */     
/*  50 */     return aou;
/*     */   }
/*     */   
/*     */   public aou a(bny ☃) {
/*  54 */     if (!☃.b()) {
/*  55 */       return aou.d;
/*     */     }
/*     */     
/*  58 */     bny bny1 = b(☃);
/*  59 */     if (bny1 == null) {
/*  60 */       return aou.d;
/*     */     }
/*     */     
/*  63 */     ceh ceh1 = c(bny1);
/*  64 */     if (ceh1 == null) {
/*  65 */       return aou.d;
/*     */     }
/*     */     
/*  68 */     if (!a(bny1, ceh1)) {
/*  69 */       return aou.d;
/*     */     }
/*     */     
/*  72 */     fx fx = bny1.a();
/*  73 */     brx brx = bny1.p();
/*  74 */     bfw bfw = bny1.n();
/*  75 */     bmb bmb = bny1.m();
/*     */ 
/*     */     
/*  78 */     ceh ceh2 = brx.d_(fx);
/*  79 */     buo buo1 = ceh2.b();
/*  80 */     if (buo1 == ceh1.b()) {
/*  81 */       ceh2 = a(fx, brx, bmb, ceh2);
/*  82 */       a(fx, brx, bfw, bmb, ceh2);
/*  83 */       buo1.a(brx, fx, ceh2, bfw, bmb);
/*  84 */       if (bfw instanceof aah) {
/*  85 */         ac.y.a((aah)bfw, fx, bmb);
/*     */       }
/*     */     } 
/*  88 */     cae cae = ceh2.o();
/*  89 */     brx.a(bfw, fx, a(ceh2), adr.e, (cae.a() + 1.0F) / 2.0F, cae.b() * 0.8F);
/*  90 */     if (bfw == null || !bfw.bC.d) {
/*  91 */       bmb.g(1);
/*     */     }
/*  93 */     return aou.a(brx.v);
/*     */   }
/*     */   
/*     */   protected adp a(ceh ☃) {
/*  97 */     return ☃.o().e();
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public bny b(bny ☃) {
/* 102 */     return ☃;
/*     */   }
/*     */   
/*     */   protected boolean a(fx ☃, brx brx1, @Nullable bfw bfw1, bmb bmb1, ceh ceh1) {
/* 106 */     return a(brx1, bfw1, ☃, bmb1);
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   protected ceh c(bny ☃) {
/* 111 */     ceh ceh = e().a(☃);
/* 112 */     return (ceh != null && b(☃, ceh)) ? ceh : null;
/*     */   }
/*     */   
/*     */   private ceh a(fx ☃, brx brx1, bmb bmb1, ceh ceh1) {
/* 116 */     ceh ceh2 = ceh1;
/* 117 */     md md = bmb1.o();
/* 118 */     if (md != null) {
/* 119 */       md md1 = md.p("BlockStateTag");
/* 120 */       cei<buo, ceh> cei = ceh2.b().m();
/* 121 */       for (String str : md1.d()) {
/* 122 */         cfj<?> cfj = cei.a(str);
/* 123 */         if (cfj != null) {
/* 124 */           String str1 = md1.c(str).f_();
/* 125 */           ceh2 = a(ceh2, cfj, str1);
/*     */         } 
/*     */       } 
/*     */     } 
/*     */     
/* 130 */     if (ceh2 != ceh1) {
/* 131 */       brx1.a(☃, ceh2, 2);
/*     */     }
/* 133 */     return ceh2;
/*     */   }
/*     */   
/*     */   private static <T extends Comparable<T>> ceh a(ceh ☃, cfj<T> cfj1, String str) {
/* 137 */     return cfj1.b(str).map(comparable -> ☃.a(cfj1, comparable)).orElse(☃);
/*     */   }
/*     */   
/*     */   protected boolean b(bny ☃, ceh ceh1) {
/* 141 */     bfw bfw = ☃.n();
/* 142 */     dcs dcs = (bfw == null) ? dcs.a() : dcs.a(bfw);
/* 143 */     return ((!d() || ceh1.a(☃.p(), ☃.a())) && ☃.p().a(ceh1, ☃.a(), dcs));
/*     */   }
/*     */   
/*     */   protected boolean d() {
/* 147 */     return true;
/*     */   }
/*     */   
/*     */   protected boolean a(bny ☃, ceh ceh1) {
/* 151 */     return ☃.p().a(☃.a(), ceh1, 11);
/*     */   }
/*     */ 
/*     */   
/*     */   public static boolean a(brx ☃, @Nullable bfw bfw1, fx fx1, bmb bmb1) {
/* 156 */     MinecraftServer minecraftServer = ☃.l();
/* 157 */     if (minecraftServer == null) {
/* 158 */       return false;
/*     */     }
/*     */     
/* 161 */     md md = bmb1.b("BlockEntityTag");
/* 162 */     if (md != null) {
/* 163 */       ccj ccj = ☃.c(fx1);
/*     */       
/* 165 */       if (ccj != null) {
/* 166 */         if (!☃.v && ccj.t() && (bfw1 == null || !bfw1.eV())) {
/* 167 */           return false;
/*     */         }
/* 169 */         md md1 = ccj.a(new md());
/* 170 */         md md2 = md1.g();
/*     */         
/* 172 */         md1.a(md);
/* 173 */         md1.b("x", fx1.u());
/* 174 */         md1.b("y", fx1.v());
/* 175 */         md1.b("z", fx1.w());
/*     */         
/* 177 */         if (!md1.equals(md2)) {
/* 178 */           ccj.a(☃.d_(fx1), md1);
/* 179 */           ccj.X_();
/* 180 */           return true;
/*     */         } 
/*     */       } 
/*     */     } 
/* 184 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public String a() {
/* 189 */     return e().i();
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(bks ☃, gj<bmb> gj1) {
/* 194 */     if (a(☃)) {
/* 195 */       e().a(☃, gj1);
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(bmb ☃, @Nullable brx brx1, List<nr> list, bnl bnl1) {
/* 201 */     super.a(☃, brx1, list, bnl1);
/* 202 */     e().a(☃, brx1, list, bnl1);
/*     */   }
/*     */   
/*     */   public buo e() {
/* 206 */     return this.a;
/*     */   }
/*     */   
/*     */   public void a(Map<buo, blx> ☃, blx blx1) {
/* 210 */     ☃.put(e(), blx1);
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\bkh.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */