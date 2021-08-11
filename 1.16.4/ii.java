/*      */ import com.google.common.collect.ImmutableList;
/*      */ import com.google.gson.JsonElement;
/*      */ import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
/*      */ import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
/*      */ import java.util.Arrays;
/*      */ import java.util.List;
/*      */ import java.util.function.BiConsumer;
/*      */ import java.util.function.BiFunction;
/*      */ import java.util.function.Consumer;
/*      */ import java.util.function.Function;
/*      */ import java.util.function.Supplier;
/*      */ import java.util.function.UnaryOperator;
/*      */ import java.util.stream.Collectors;
/*      */ import java.util.stream.IntStream;
/*      */ import javax.annotation.Nullable;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ public class ii
/*      */ {
/*      */   private final Consumer<il> a;
/*      */   private final BiConsumer<vk, Supplier<JsonElement>> b;
/*      */   private final Consumer<blx> c;
/*      */   
/*      */   public ii(Consumer<il> ☃, BiConsumer<vk, Supplier<JsonElement>> biConsumer, Consumer<blx> consumer) {
/*   82 */     this.a = ☃;
/*   83 */     this.b = biConsumer;
/*   84 */     this.c = consumer;
/*      */   }
/*      */   
/*      */   private void a(buo ☃) {
/*   88 */     this.c.accept(☃.h());
/*      */   }
/*      */   
/*      */   private void c(buo ☃, vk vk1) {
/*   92 */     this.b.accept(iw.a(☃.h()), new iv(vk1));
/*      */   }
/*      */   
/*      */   private void a(blx ☃, vk vk1) {
/*   96 */     this.b.accept(iw.a(☃), new iv(vk1));
/*      */   }
/*      */   
/*      */   private void a(blx ☃) {
/*  100 */     iy.aK.a(iw.a(☃), iz.b(☃), this.b);
/*      */   }
/*      */   
/*      */   private void b(buo ☃) {
/*  104 */     blx blx = ☃.h();
/*  105 */     if (blx != bmd.a) {
/*  106 */       iy.aK.a(iw.a(blx), iz.B(☃), this.b);
/*      */     }
/*      */   }
/*      */   
/*      */   private void a(buo ☃, String str) {
/*  111 */     blx blx = ☃.h();
/*  112 */     iy.aK.a(iw.a(blx), iz.j(iz.a(☃, str)), this.b);
/*      */   }
/*      */   
/*      */   private static ip b() {
/*  116 */     return ip.<gc>a(cex.O)
/*  117 */       .a(gc.f, ir.a().a(is.b, is.a.b))
/*  118 */       .a(gc.d, ir.a().a(is.b, is.a.c))
/*  119 */       .a(gc.e, ir.a().a(is.b, is.a.d))
/*  120 */       .a(gc.c, ir.a());
/*      */   }
/*      */   
/*      */   private static ip c() {
/*  124 */     return ip.<gc>a(cex.O)
/*  125 */       .a(gc.d, ir.a())
/*  126 */       .a(gc.e, ir.a().a(is.b, is.a.b))
/*  127 */       .a(gc.c, ir.a().a(is.b, is.a.c))
/*  128 */       .a(gc.f, ir.a().a(is.b, is.a.d));
/*      */   }
/*      */   
/*      */   private static ip d() {
/*  132 */     return ip.<gc>a(cex.O)
/*  133 */       .a(gc.f, ir.a())
/*  134 */       .a(gc.d, ir.a().a(is.b, is.a.b))
/*  135 */       .a(gc.e, ir.a().a(is.b, is.a.c))
/*  136 */       .a(gc.c, ir.a().a(is.b, is.a.d));
/*      */   }
/*      */   
/*      */   private static ip e() {
/*  140 */     return ip.<gc>a(cex.M)
/*  141 */       .a(gc.a, ir.a().a(is.a, is.a.b))
/*  142 */       .a(gc.b, ir.a().a(is.a, is.a.d))
/*  143 */       .a(gc.c, ir.a())
/*  144 */       .a(gc.d, ir.a().a(is.b, is.a.c))
/*  145 */       .a(gc.e, ir.a().a(is.b, is.a.d))
/*  146 */       .a(gc.f, ir.a().a(is.b, is.a.b));
/*      */   }
/*      */   
/*      */   private static io d(buo ☃, vk vk1) {
/*  150 */     return io.a(☃, a(vk1));
/*      */   }
/*      */   
/*      */   private static ir[] a(vk ☃) {
/*  154 */     return new ir[] { ir.a().a(is.c, ☃), 
/*  155 */         ir.a().<vk>a(is.c, ☃).a(is.b, is.a.b), 
/*  156 */         ir.a().<vk>a(is.c, ☃).a(is.b, is.a.c), 
/*  157 */         ir.a().<vk>a(is.c, ☃).a(is.b, is.a.d) };
/*      */   }
/*      */   
/*      */   private static io e(buo ☃, vk vk1, vk vk2) {
/*  161 */     return io.a(☃, new ir[] {
/*  162 */           ir.a().a(is.c, vk1), 
/*  163 */           ir.a().a(is.c, vk2), 
/*  164 */           ir.a().<vk>a(is.c, vk1).a(is.b, is.a.c), 
/*  165 */           ir.a().<vk>a(is.c, vk2).a(is.b, is.a.c)
/*      */         });
/*      */   }
/*      */   
/*      */   private static ip a(cey ☃, vk vk1, vk vk2) {
/*  170 */     return ip.<Boolean>a(☃)
/*  171 */       .a(Boolean.valueOf(true), ir.a().a(is.c, vk1))
/*  172 */       .a(Boolean.valueOf(false), ir.a().a(is.c, vk2));
/*      */   }
/*      */   
/*      */   private void c(buo ☃) {
/*  176 */     vk vk1 = jb.a.a(☃, this.b);
/*  177 */     vk vk2 = jb.b.a(☃, this.b);
/*  178 */     this.a.accept(e(☃, vk1, vk2));
/*      */   }
/*      */   
/*      */   private void d(buo ☃) {
/*  182 */     vk vk = jb.a.a(☃, this.b);
/*  183 */     this.a.accept(d(☃, vk));
/*      */   }
/*      */   
/*      */   private static il f(buo ☃, vk vk1, vk vk2) {
/*  187 */     return io.a(☃)
/*  188 */       .a(
/*  189 */         ip.<Boolean>a(cex.w)
/*  190 */         .a(Boolean.valueOf(false), ir.a().a(is.c, vk1))
/*  191 */         .a(Boolean.valueOf(true), ir.a().a(is.c, vk2)))
/*      */       
/*  193 */       .a(
/*  194 */         ip.<cet, gc>a(cex.Q, cex.O)
/*  195 */         .a(cet.a, gc.f, ir.a().a(is.b, is.a.b))
/*  196 */         .a(cet.a, gc.e, ir.a().a(is.b, is.a.d))
/*  197 */         .a(cet.a, gc.d, ir.a().a(is.b, is.a.c))
/*  198 */         .a(cet.a, gc.c, ir.a())
/*      */         
/*  200 */         .a(cet.b, gc.f, ir.a().<is.a>a(is.b, is.a.b).<is.a>a(is.a, is.a.b).a(is.d, Boolean.valueOf(true)))
/*  201 */         .a(cet.b, gc.e, ir.a().<is.a>a(is.b, is.a.d).<is.a>a(is.a, is.a.b).a(is.d, Boolean.valueOf(true)))
/*  202 */         .a(cet.b, gc.d, ir.a().<is.a>a(is.b, is.a.c).<is.a>a(is.a, is.a.b).a(is.d, Boolean.valueOf(true)))
/*  203 */         .a(cet.b, gc.c, ir.a().<is.a>a(is.a, is.a.b).a(is.d, Boolean.valueOf(true)))
/*      */         
/*  205 */         .a(cet.c, gc.f, ir.a().<is.a>a(is.b, is.a.d).a(is.a, is.a.c))
/*  206 */         .a(cet.c, gc.e, ir.a().<is.a>a(is.b, is.a.b).a(is.a, is.a.c))
/*  207 */         .a(cet.c, gc.d, ir.a().a(is.a, is.a.c))
/*  208 */         .a(cet.c, gc.c, ir.a().<is.a>a(is.b, is.a.c).a(is.a, is.a.c)));
/*      */   }
/*      */ 
/*      */   
/*      */   private static ip.d<gc, cfd, cfc, Boolean> a(ip.d<gc, cfd, cfc, Boolean> ☃, cfd cfd1, vk vk1, vk vk2) {
/*  213 */     return ☃
/*  214 */       .a(gc.f, cfd1, cfc.a, Boolean.valueOf(false), ir.a().a(is.c, vk1))
/*  215 */       .a(gc.d, cfd1, cfc.a, Boolean.valueOf(false), ir.a().<vk>a(is.c, vk1).a(is.b, is.a.b))
/*  216 */       .a(gc.e, cfd1, cfc.a, Boolean.valueOf(false), ir.a().<vk>a(is.c, vk1).a(is.b, is.a.c))
/*  217 */       .a(gc.c, cfd1, cfc.a, Boolean.valueOf(false), ir.a().<vk>a(is.c, vk1).a(is.b, is.a.d))
/*      */       
/*  219 */       .a(gc.f, cfd1, cfc.b, Boolean.valueOf(false), ir.a().a(is.c, vk2))
/*  220 */       .a(gc.d, cfd1, cfc.b, Boolean.valueOf(false), ir.a().<vk>a(is.c, vk2).a(is.b, is.a.b))
/*  221 */       .a(gc.e, cfd1, cfc.b, Boolean.valueOf(false), ir.a().<vk>a(is.c, vk2).a(is.b, is.a.c))
/*  222 */       .a(gc.c, cfd1, cfc.b, Boolean.valueOf(false), ir.a().<vk>a(is.c, vk2).a(is.b, is.a.d))
/*      */       
/*  224 */       .a(gc.f, cfd1, cfc.a, Boolean.valueOf(true), ir.a().<vk>a(is.c, vk2).a(is.b, is.a.b))
/*  225 */       .a(gc.d, cfd1, cfc.a, Boolean.valueOf(true), ir.a().<vk>a(is.c, vk2).a(is.b, is.a.c))
/*  226 */       .a(gc.e, cfd1, cfc.a, Boolean.valueOf(true), ir.a().<vk>a(is.c, vk2).a(is.b, is.a.d))
/*  227 */       .a(gc.c, cfd1, cfc.a, Boolean.valueOf(true), ir.a().a(is.c, vk2))
/*      */       
/*  229 */       .a(gc.f, cfd1, cfc.b, Boolean.valueOf(true), ir.a().<vk>a(is.c, vk1).a(is.b, is.a.d))
/*  230 */       .a(gc.d, cfd1, cfc.b, Boolean.valueOf(true), ir.a().a(is.c, vk1))
/*  231 */       .a(gc.e, cfd1, cfc.b, Boolean.valueOf(true), ir.a().<vk>a(is.c, vk1).a(is.b, is.a.b))
/*  232 */       .a(gc.c, cfd1, cfc.b, Boolean.valueOf(true), ir.a().<vk>a(is.c, vk1).a(is.b, is.a.c));
/*      */   }
/*      */   
/*      */   private static il b(buo ☃, vk vk1, vk vk2, vk vk3, vk vk4) {
/*  236 */     return io.a(☃)
/*  237 */       .a(
/*  238 */         a(
/*  239 */           a(ip.a(cex.O, cex.aa, cex.aH, cex.u), cfd.b, vk1, vk2), cfd.a, vk3, vk4));
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private static il g(buo ☃, vk vk1, vk vk2) {
/*  246 */     return in.a(☃)
/*  247 */       .a(ir.a().a(is.c, vk1))
/*  248 */       .a(im.a().a(cex.I, Boolean.valueOf(true)), ir.a().<vk>a(is.c, vk2).a(is.d, Boolean.valueOf(true)))
/*  249 */       .a(im.a().a(cex.J, Boolean.valueOf(true)), ir.a().<vk>a(is.c, vk2).<is.a>a(is.b, is.a.b).a(is.d, Boolean.valueOf(true)))
/*  250 */       .a(im.a().a(cex.K, Boolean.valueOf(true)), ir.a().<vk>a(is.c, vk2).<is.a>a(is.b, is.a.c).a(is.d, Boolean.valueOf(true)))
/*  251 */       .a(im.a().a(cex.L, Boolean.valueOf(true)), ir.a().<vk>a(is.c, vk2).<is.a>a(is.b, is.a.d).a(is.d, Boolean.valueOf(true)));
/*      */   }
/*      */   
/*      */   private static il d(buo ☃, vk vk1, vk vk2, vk vk3) {
/*  255 */     return in.a(☃)
/*  256 */       .a(im.a().a(cex.G, Boolean.valueOf(true)), ir.a().a(is.c, vk1))
/*      */       
/*  258 */       .a(im.a().a(cex.T, cfp.b), ir.a().<vk>a(is.c, vk2).a(is.d, Boolean.valueOf(true)))
/*  259 */       .a(im.a().a(cex.S, cfp.b), ir.a().<vk>a(is.c, vk2).<is.a>a(is.b, is.a.b).a(is.d, Boolean.valueOf(true)))
/*  260 */       .a(im.a().a(cex.U, cfp.b), ir.a().<vk>a(is.c, vk2).<is.a>a(is.b, is.a.c).a(is.d, Boolean.valueOf(true)))
/*  261 */       .a(im.a().a(cex.V, cfp.b), ir.a().<vk>a(is.c, vk2).<is.a>a(is.b, is.a.d).a(is.d, Boolean.valueOf(true)))
/*      */       
/*  263 */       .a(im.a().a(cex.T, cfp.c), ir.a().<vk>a(is.c, vk3).a(is.d, Boolean.valueOf(true)))
/*  264 */       .a(im.a().a(cex.S, cfp.c), ir.a().<vk>a(is.c, vk3).<is.a>a(is.b, is.a.b).a(is.d, Boolean.valueOf(true)))
/*  265 */       .a(im.a().a(cex.U, cfp.c), ir.a().<vk>a(is.c, vk3).<is.a>a(is.b, is.a.c).a(is.d, Boolean.valueOf(true)))
/*  266 */       .a(im.a().a(cex.V, cfp.c), ir.a().<vk>a(is.c, vk3).<is.a>a(is.b, is.a.d).a(is.d, Boolean.valueOf(true)));
/*      */   }
/*      */ 
/*      */   
/*      */   private static il c(buo ☃, vk vk1, vk vk2, vk vk3, vk vk4) {
/*  271 */     return io.a(☃, ir.a().a(is.d, Boolean.valueOf(true)))
/*  272 */       .a(c())
/*  273 */       .a(
/*  274 */         ip.<Boolean, Boolean>a(cex.q, cex.u)
/*  275 */         .a(Boolean.valueOf(false), Boolean.valueOf(false), ir.a().a(is.c, vk2))
/*  276 */         .a(Boolean.valueOf(true), Boolean.valueOf(false), ir.a().a(is.c, vk4))
/*  277 */         .a(Boolean.valueOf(false), Boolean.valueOf(true), ir.a().a(is.c, vk1))
/*  278 */         .a(Boolean.valueOf(true), Boolean.valueOf(true), ir.a().a(is.c, vk3)));
/*      */   }
/*      */ 
/*      */   
/*      */   private static il e(buo ☃, vk vk1, vk vk2, vk vk3) {
/*  283 */     return io.a(☃)
/*  284 */       .a(
/*  285 */         ip.<gc, cff, cfn>a(cex.O, cex.ab, cex.aL)
/*  286 */         .a(gc.f, cff.b, cfn.a, ir.a().a(is.c, vk2))
/*  287 */         .a(gc.e, cff.b, cfn.a, ir.a().<vk>a(is.c, vk2).<is.a>a(is.b, is.a.c).a(is.d, Boolean.valueOf(true)))
/*  288 */         .a(gc.d, cff.b, cfn.a, ir.a().<vk>a(is.c, vk2).<is.a>a(is.b, is.a.b).a(is.d, Boolean.valueOf(true)))
/*  289 */         .a(gc.c, cff.b, cfn.a, ir.a().<vk>a(is.c, vk2).<is.a>a(is.b, is.a.d).a(is.d, Boolean.valueOf(true)))
/*  290 */         .a(gc.f, cff.b, cfn.e, ir.a().a(is.c, vk3))
/*  291 */         .a(gc.e, cff.b, cfn.e, ir.a().<vk>a(is.c, vk3).<is.a>a(is.b, is.a.c).a(is.d, Boolean.valueOf(true)))
/*  292 */         .a(gc.d, cff.b, cfn.e, ir.a().<vk>a(is.c, vk3).<is.a>a(is.b, is.a.b).a(is.d, Boolean.valueOf(true)))
/*  293 */         .a(gc.c, cff.b, cfn.e, ir.a().<vk>a(is.c, vk3).<is.a>a(is.b, is.a.d).a(is.d, Boolean.valueOf(true)))
/*  294 */         .a(gc.f, cff.b, cfn.d, ir.a().<vk>a(is.c, vk3).<is.a>a(is.b, is.a.d).a(is.d, Boolean.valueOf(true)))
/*  295 */         .a(gc.e, cff.b, cfn.d, ir.a().<vk>a(is.c, vk3).<is.a>a(is.b, is.a.b).a(is.d, Boolean.valueOf(true)))
/*  296 */         .a(gc.d, cff.b, cfn.d, ir.a().a(is.c, vk3))
/*  297 */         .a(gc.c, cff.b, cfn.d, ir.a().<vk>a(is.c, vk3).<is.a>a(is.b, is.a.c).a(is.d, Boolean.valueOf(true)))
/*  298 */         .a(gc.f, cff.b, cfn.c, ir.a().a(is.c, vk1))
/*  299 */         .a(gc.e, cff.b, cfn.c, ir.a().<vk>a(is.c, vk1).<is.a>a(is.b, is.a.c).a(is.d, Boolean.valueOf(true)))
/*  300 */         .a(gc.d, cff.b, cfn.c, ir.a().<vk>a(is.c, vk1).<is.a>a(is.b, is.a.b).a(is.d, Boolean.valueOf(true)))
/*  301 */         .a(gc.c, cff.b, cfn.c, ir.a().<vk>a(is.c, vk1).<is.a>a(is.b, is.a.d).a(is.d, Boolean.valueOf(true)))
/*  302 */         .a(gc.f, cff.b, cfn.b, ir.a().<vk>a(is.c, vk1).<is.a>a(is.b, is.a.d).a(is.d, Boolean.valueOf(true)))
/*  303 */         .a(gc.e, cff.b, cfn.b, ir.a().<vk>a(is.c, vk1).<is.a>a(is.b, is.a.b).a(is.d, Boolean.valueOf(true)))
/*  304 */         .a(gc.d, cff.b, cfn.b, ir.a().a(is.c, vk1))
/*  305 */         .a(gc.c, cff.b, cfn.b, ir.a().<vk>a(is.c, vk1).<is.a>a(is.b, is.a.c).a(is.d, Boolean.valueOf(true)))
/*  306 */         .a(gc.f, cff.a, cfn.a, ir.a().<vk>a(is.c, vk2).<is.a>a(is.a, is.a.c).a(is.d, Boolean.valueOf(true)))
/*  307 */         .a(gc.e, cff.a, cfn.a, ir.a().<vk>a(is.c, vk2).<is.a>a(is.a, is.a.c).<is.a>a(is.b, is.a.c).a(is.d, Boolean.valueOf(true)))
/*  308 */         .a(gc.d, cff.a, cfn.a, ir.a().<vk>a(is.c, vk2).<is.a>a(is.a, is.a.c).<is.a>a(is.b, is.a.b).a(is.d, Boolean.valueOf(true)))
/*  309 */         .a(gc.c, cff.a, cfn.a, ir.a().<vk>a(is.c, vk2).<is.a>a(is.a, is.a.c).<is.a>a(is.b, is.a.d).a(is.d, Boolean.valueOf(true)))
/*  310 */         .a(gc.f, cff.a, cfn.e, ir.a().<vk>a(is.c, vk3).<is.a>a(is.a, is.a.c).<is.a>a(is.b, is.a.b).a(is.d, Boolean.valueOf(true)))
/*  311 */         .a(gc.e, cff.a, cfn.e, ir.a().<vk>a(is.c, vk3).<is.a>a(is.a, is.a.c).<is.a>a(is.b, is.a.d).a(is.d, Boolean.valueOf(true)))
/*  312 */         .a(gc.d, cff.a, cfn.e, ir.a().<vk>a(is.c, vk3).<is.a>a(is.a, is.a.c).<is.a>a(is.b, is.a.c).a(is.d, Boolean.valueOf(true)))
/*  313 */         .a(gc.c, cff.a, cfn.e, ir.a().<vk>a(is.c, vk3).<is.a>a(is.a, is.a.c).a(is.d, Boolean.valueOf(true)))
/*  314 */         .a(gc.f, cff.a, cfn.d, ir.a().<vk>a(is.c, vk3).<is.a>a(is.a, is.a.c).a(is.d, Boolean.valueOf(true)))
/*  315 */         .a(gc.e, cff.a, cfn.d, ir.a().<vk>a(is.c, vk3).<is.a>a(is.a, is.a.c).<is.a>a(is.b, is.a.c).a(is.d, Boolean.valueOf(true)))
/*  316 */         .a(gc.d, cff.a, cfn.d, ir.a().<vk>a(is.c, vk3).<is.a>a(is.a, is.a.c).<is.a>a(is.b, is.a.b).a(is.d, Boolean.valueOf(true)))
/*  317 */         .a(gc.c, cff.a, cfn.d, ir.a().<vk>a(is.c, vk3).<is.a>a(is.a, is.a.c).<is.a>a(is.b, is.a.d).a(is.d, Boolean.valueOf(true)))
/*  318 */         .a(gc.f, cff.a, cfn.c, ir.a().<vk>a(is.c, vk1).<is.a>a(is.a, is.a.c).<is.a>a(is.b, is.a.b).a(is.d, Boolean.valueOf(true)))
/*  319 */         .a(gc.e, cff.a, cfn.c, ir.a().<vk>a(is.c, vk1).<is.a>a(is.a, is.a.c).<is.a>a(is.b, is.a.d).a(is.d, Boolean.valueOf(true)))
/*  320 */         .a(gc.d, cff.a, cfn.c, ir.a().<vk>a(is.c, vk1).<is.a>a(is.a, is.a.c).<is.a>a(is.b, is.a.c).a(is.d, Boolean.valueOf(true)))
/*  321 */         .a(gc.c, cff.a, cfn.c, ir.a().<vk>a(is.c, vk1).<is.a>a(is.a, is.a.c).a(is.d, Boolean.valueOf(true)))
/*  322 */         .a(gc.f, cff.a, cfn.b, ir.a().<vk>a(is.c, vk1).<is.a>a(is.a, is.a.c).a(is.d, Boolean.valueOf(true)))
/*  323 */         .a(gc.e, cff.a, cfn.b, ir.a().<vk>a(is.c, vk1).<is.a>a(is.a, is.a.c).<is.a>a(is.b, is.a.c).a(is.d, Boolean.valueOf(true)))
/*  324 */         .a(gc.d, cff.a, cfn.b, ir.a().<vk>a(is.c, vk1).<is.a>a(is.a, is.a.c).<is.a>a(is.b, is.a.b).a(is.d, Boolean.valueOf(true)))
/*  325 */         .a(gc.c, cff.a, cfn.b, ir.a().<vk>a(is.c, vk1).<is.a>a(is.a, is.a.c).<is.a>a(is.b, is.a.d).a(is.d, Boolean.valueOf(true))));
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   private static il f(buo ☃, vk vk1, vk vk2, vk vk3) {
/*  331 */     return io.a(☃)
/*  332 */       .a(
/*  333 */         ip.<gc, cff, Boolean>a(cex.O, cex.ab, cex.u)
/*  334 */         .a(gc.c, cff.b, Boolean.valueOf(false), ir.a().a(is.c, vk2))
/*  335 */         .a(gc.d, cff.b, Boolean.valueOf(false), ir.a().<vk>a(is.c, vk2).a(is.b, is.a.c))
/*  336 */         .a(gc.f, cff.b, Boolean.valueOf(false), ir.a().<vk>a(is.c, vk2).a(is.b, is.a.b))
/*  337 */         .a(gc.e, cff.b, Boolean.valueOf(false), ir.a().<vk>a(is.c, vk2).a(is.b, is.a.d))
/*  338 */         .a(gc.c, cff.a, Boolean.valueOf(false), ir.a().a(is.c, vk1))
/*  339 */         .a(gc.d, cff.a, Boolean.valueOf(false), ir.a().<vk>a(is.c, vk1).a(is.b, is.a.c))
/*  340 */         .a(gc.f, cff.a, Boolean.valueOf(false), ir.a().<vk>a(is.c, vk1).a(is.b, is.a.b))
/*  341 */         .a(gc.e, cff.a, Boolean.valueOf(false), ir.a().<vk>a(is.c, vk1).a(is.b, is.a.d))
/*  342 */         .a(gc.c, cff.b, Boolean.valueOf(true), ir.a().a(is.c, vk3))
/*  343 */         .a(gc.d, cff.b, Boolean.valueOf(true), ir.a().<vk>a(is.c, vk3).a(is.b, is.a.c))
/*  344 */         .a(gc.f, cff.b, Boolean.valueOf(true), ir.a().<vk>a(is.c, vk3).a(is.b, is.a.b))
/*  345 */         .a(gc.e, cff.b, Boolean.valueOf(true), ir.a().<vk>a(is.c, vk3).a(is.b, is.a.d))
/*  346 */         .a(gc.c, cff.a, Boolean.valueOf(true), ir.a().<vk>a(is.c, vk3).<is.a>a(is.a, is.a.c).a(is.b, is.a.c))
/*  347 */         .a(gc.d, cff.a, Boolean.valueOf(true), ir.a().<vk>a(is.c, vk3).<is.a>a(is.a, is.a.c).a(is.b, is.a.a))
/*  348 */         .a(gc.f, cff.a, Boolean.valueOf(true), ir.a().<vk>a(is.c, vk3).<is.a>a(is.a, is.a.c).a(is.b, is.a.d))
/*  349 */         .a(gc.e, cff.a, Boolean.valueOf(true), ir.a().<vk>a(is.c, vk3).<is.a>a(is.a, is.a.c).a(is.b, is.a.b)));
/*      */   }
/*      */ 
/*      */   
/*      */   private static il g(buo ☃, vk vk1, vk vk2, vk vk3) {
/*  354 */     return io.a(☃)
/*  355 */       .a(
/*  356 */         ip.<gc, cff, Boolean>a(cex.O, cex.ab, cex.u)
/*  357 */         .a(gc.c, cff.b, Boolean.valueOf(false), ir.a().a(is.c, vk2))
/*  358 */         .a(gc.d, cff.b, Boolean.valueOf(false), ir.a().a(is.c, vk2))
/*  359 */         .a(gc.f, cff.b, Boolean.valueOf(false), ir.a().a(is.c, vk2))
/*  360 */         .a(gc.e, cff.b, Boolean.valueOf(false), ir.a().a(is.c, vk2))
/*  361 */         .a(gc.c, cff.a, Boolean.valueOf(false), ir.a().a(is.c, vk1))
/*  362 */         .a(gc.d, cff.a, Boolean.valueOf(false), ir.a().a(is.c, vk1))
/*  363 */         .a(gc.f, cff.a, Boolean.valueOf(false), ir.a().a(is.c, vk1))
/*  364 */         .a(gc.e, cff.a, Boolean.valueOf(false), ir.a().a(is.c, vk1))
/*  365 */         .a(gc.c, cff.b, Boolean.valueOf(true), ir.a().a(is.c, vk3))
/*  366 */         .a(gc.d, cff.b, Boolean.valueOf(true), ir.a().<vk>a(is.c, vk3).a(is.b, is.a.c))
/*  367 */         .a(gc.f, cff.b, Boolean.valueOf(true), ir.a().<vk>a(is.c, vk3).a(is.b, is.a.b))
/*  368 */         .a(gc.e, cff.b, Boolean.valueOf(true), ir.a().<vk>a(is.c, vk3).a(is.b, is.a.d))
/*  369 */         .a(gc.c, cff.a, Boolean.valueOf(true), ir.a().a(is.c, vk3))
/*  370 */         .a(gc.d, cff.a, Boolean.valueOf(true), ir.a().<vk>a(is.c, vk3).a(is.b, is.a.c))
/*  371 */         .a(gc.f, cff.a, Boolean.valueOf(true), ir.a().<vk>a(is.c, vk3).a(is.b, is.a.b))
/*  372 */         .a(gc.e, cff.a, Boolean.valueOf(true), ir.a().<vk>a(is.c, vk3).a(is.b, is.a.d)));
/*      */   }
/*      */ 
/*      */   
/*      */   private static io e(buo ☃, vk vk1) {
/*  377 */     return io.a(☃, ir.a().a(is.c, vk1));
/*      */   }
/*      */   
/*      */   private static ip f() {
/*  381 */     return ip.<gc.a>a(cex.F)
/*  382 */       .a(gc.a.b, ir.a())
/*  383 */       .a(gc.a.c, ir.a().a(is.a, is.a.b))
/*  384 */       .a(gc.a.a, ir.a().<is.a>a(is.a, is.a.b).a(is.b, is.a.b));
/*      */   }
/*      */   
/*      */   private static il f(buo ☃, vk vk1) {
/*  388 */     return io.a(☃, ir.a().a(is.c, vk1)).a(f());
/*      */   }
/*      */   
/*      */   private void g(buo ☃, vk vk1) {
/*  392 */     this.a.accept(f(☃, vk1));
/*      */   }
/*      */   
/*      */   private void a(buo ☃, jb.a a1) {
/*  396 */     vk vk = a1.a(☃, this.b);
/*  397 */     this.a.accept(f(☃, vk));
/*      */   }
/*      */   
/*      */   private void b(buo ☃, jb.a a1) {
/*  401 */     vk vk = a1.a(☃, this.b);
/*  402 */     this.a.accept(io.a(☃, ir.a().a(is.c, vk)).a(b()));
/*      */   }
/*      */   
/*      */   private static il h(buo ☃, vk vk1, vk vk2) {
/*  406 */     return io.a(☃)
/*  407 */       .a(
/*  408 */         ip.<gc.a>a(cex.F)
/*  409 */         .a(gc.a.b, ir.a().a(is.c, vk1))
/*  410 */         .a(gc.a.c, ir.a().<vk>a(is.c, vk2).a(is.a, is.a.b))
/*  411 */         .a(gc.a.a, ir.a().<vk>a(is.c, vk2).<is.a>a(is.a, is.a.b).a(is.b, is.a.b)));
/*      */   }
/*      */ 
/*      */   
/*      */   private void a(buo ☃, jb.a a1, jb.a a2) {
/*  416 */     vk vk1 = a1.a(☃, this.b);
/*  417 */     vk vk2 = a2.a(☃, this.b);
/*  418 */     this.a.accept(h(☃, vk1, vk2));
/*      */   }
/*      */   
/*      */   private vk a(buo ☃, String str, ix ix1, Function<vk, iz> function) {
/*  422 */     return ix1.a(☃, str, function.apply(iz.a(☃, str)), this.b);
/*      */   }
/*      */   
/*      */   private static il i(buo ☃, vk vk1, vk vk2) {
/*  426 */     return io.a(☃)
/*  427 */       .a(a(cex.w, vk2, vk1));
/*      */   }
/*      */   
/*      */   private static il h(buo ☃, vk vk1, vk vk2, vk vk3) {
/*  431 */     return io.a(☃)
/*  432 */       .a(
/*  433 */         ip.<cfm>a(cex.aK)
/*  434 */         .a(cfm.b, ir.a().a(is.c, vk1))
/*  435 */         .a(cfm.a, ir.a().a(is.c, vk2))
/*  436 */         .a(cfm.c, ir.a().a(is.c, vk3)));
/*      */   }
/*      */ 
/*      */   
/*      */   private void e(buo ☃) {
/*  441 */     c(☃, jb.a);
/*      */   }
/*      */   
/*      */   private void c(buo ☃, jb.a a1) {
/*  445 */     this.a.accept(e(☃, a1.a(☃, this.b)));
/*      */   }
/*      */   
/*      */   private void a(buo ☃, iz iz1, ix ix1) {
/*  449 */     vk vk = ix1.a(☃, iz1, this.b);
/*  450 */     this.a.accept(e(☃, vk));
/*      */   }
/*      */   
/*      */   class b
/*      */   {
/*      */     private final iz b;
/*      */     @Nullable
/*      */     private vk c;
/*      */     
/*      */     public b(ii this$0, iz ☃) {
/*  460 */       this.b = ☃;
/*      */     }
/*      */     
/*      */     public b a(buo ☃, ix ix1) {
/*  464 */       this.c = ix1.a(☃, this.b, ii.a(this.a));
/*  465 */       ii.b(this.a).accept(ii.a(☃, this.c));
/*  466 */       return this;
/*      */     }
/*      */     
/*      */     public b a(Function<iz, vk> ☃) {
/*  470 */       this.c = ☃.apply(this.b);
/*  471 */       return this;
/*      */     }
/*      */     
/*      */     public b a(buo ☃) {
/*  475 */       vk vk1 = iy.l.a(☃, this.b, ii.a(this.a));
/*  476 */       vk vk2 = iy.m.a(☃, this.b, ii.a(this.a));
/*  477 */       ii.b(this.a).accept(ii.a(☃, vk1, vk2));
/*      */       
/*  479 */       vk vk3 = iy.n.a(☃, this.b, ii.a(this.a));
/*  480 */       ii.a(this.a, ☃, vk3);
/*  481 */       return this;
/*      */     }
/*      */     
/*      */     public b b(buo ☃) {
/*  485 */       vk vk1 = iy.v.a(☃, this.b, ii.a(this.a));
/*  486 */       vk vk2 = iy.w.a(☃, this.b, ii.a(this.a));
/*  487 */       vk vk3 = iy.x.a(☃, this.b, ii.a(this.a));
/*  488 */       ii.b(this.a).accept(ii.a(☃, vk1, vk2, vk3));
/*      */       
/*  490 */       vk vk4 = iy.y.a(☃, this.b, ii.a(this.a));
/*  491 */       ii.a(this.a, ☃, vk4);
/*  492 */       return this;
/*      */     }
/*      */     
/*      */     public b c(buo ☃) {
/*  496 */       vk vk1 = iy.s.a(☃, this.b, ii.a(this.a));
/*  497 */       vk vk2 = iy.t.a(☃, this.b, ii.a(this.a));
/*  498 */       ii.b(this.a).accept(ii.b(☃, vk1, vk2));
/*      */       
/*  500 */       vk vk3 = iy.u.a(☃, this.b, ii.a(this.a));
/*  501 */       ii.a(this.a, ☃, vk3);
/*  502 */       return this;
/*      */     }
/*      */     
/*      */     public b d(buo ☃) {
/*  506 */       vk vk1 = iy.A.a(☃, this.b, ii.a(this.a));
/*  507 */       vk vk2 = iy.z.a(☃, this.b, ii.a(this.a));
/*  508 */       vk vk3 = iy.C.a(☃, this.b, ii.a(this.a));
/*  509 */       vk vk4 = iy.B.a(☃, this.b, ii.a(this.a));
/*  510 */       ii.b(this.a).accept(ii.a(☃, vk1, vk2, vk3, vk4));
/*  511 */       return this;
/*      */     }
/*      */     
/*      */     public b e(buo ☃) {
/*  515 */       vk vk1 = iy.D.a(☃, this.b, ii.a(this.a));
/*  516 */       vk vk2 = iy.E.a(☃, this.b, ii.a(this.a));
/*  517 */       ii.b(this.a).accept(ii.c(☃, vk1, vk2));
/*  518 */       return this;
/*      */     }
/*      */     
/*      */     public b a(buo ☃, buo buo1) {
/*  522 */       vk vk1 = iy.F.a(☃, this.b, ii.a(this.a));
/*  523 */       ii.b(this.a).accept(ii.a(☃, vk1));
/*  524 */       ii.b(this.a).accept(ii.a(buo1, vk1));
/*  525 */       ii.a(this.a, ☃.h());
/*  526 */       ii.a(this.a, buo1);
/*  527 */       return this;
/*      */     }
/*      */     
/*      */     public b f(buo ☃) {
/*  531 */       if (this.c == null) {
/*  532 */         throw new IllegalStateException("Full block not generated yet");
/*      */       }
/*  534 */       vk vk1 = iy.G.a(☃, this.b, ii.a(this.a));
/*  535 */       vk vk2 = iy.H.a(☃, this.b, ii.a(this.a));
/*  536 */       ii.b(this.a).accept(ii.b(☃, vk1, vk2, this.c));
/*  537 */       return this;
/*      */     }
/*      */     
/*      */     public b g(buo ☃) {
/*  541 */       vk vk1 = iy.K.a(☃, this.b, ii.a(this.a));
/*  542 */       vk vk2 = iy.J.a(☃, this.b, ii.a(this.a));
/*  543 */       vk vk3 = iy.L.a(☃, this.b, ii.a(this.a));
/*      */       
/*  545 */       ii.b(this.a).accept(ii.c(☃, vk1, vk2, vk3));
/*  546 */       return this;
/*      */     }
/*      */   }
/*      */ 
/*      */   
/*      */   private b a(buo ☃, jb jb1) {
/*  552 */     return (new b(this, jb1.b())).a(☃, jb1.a());
/*      */   }
/*      */   
/*      */   private b d(buo ☃, jb.a a1) {
/*  556 */     jb jb = a1.get(☃);
/*  557 */     return (new b(this, jb.b())).a(☃, jb.a());
/*      */   }
/*      */   
/*      */   private b f(buo ☃) {
/*  561 */     return d(☃, jb.a);
/*      */   }
/*      */   
/*      */   private b a(iz ☃) {
/*  565 */     return new b(this, ☃);
/*      */   }
/*      */   
/*      */   private void g(buo ☃) {
/*  569 */     iz iz = iz.p(☃);
/*  570 */     vk vk1 = iy.o.a(☃, iz, this.b);
/*  571 */     vk vk2 = iy.p.a(☃, iz, this.b);
/*  572 */     vk vk3 = iy.q.a(☃, iz, this.b);
/*  573 */     vk vk4 = iy.r.a(☃, iz, this.b);
/*      */     
/*  575 */     a(☃.h());
/*  576 */     this.a.accept(b(☃, vk1, vk2, vk3, vk4));
/*      */   }
/*      */   
/*      */   private void h(buo ☃) {
/*  580 */     iz iz = iz.b(☃);
/*  581 */     vk vk1 = iy.P.a(☃, iz, this.b);
/*  582 */     vk vk2 = iy.Q.a(☃, iz, this.b);
/*  583 */     vk vk3 = iy.R.a(☃, iz, this.b);
/*      */     
/*  585 */     this.a.accept(f(☃, vk1, vk2, vk3));
/*  586 */     c(☃, vk2);
/*      */   }
/*      */   
/*      */   private void i(buo ☃) {
/*  590 */     iz iz = iz.b(☃);
/*  591 */     vk vk1 = iy.M.a(☃, iz, this.b);
/*  592 */     vk vk2 = iy.N.a(☃, iz, this.b);
/*  593 */     vk vk3 = iy.O.a(☃, iz, this.b);
/*      */     
/*  595 */     this.a.accept(g(☃, vk1, vk2, vk3));
/*  596 */     c(☃, vk2);
/*      */   }
/*      */   
/*      */   class d
/*      */   {
/*      */     private final iz b;
/*      */     
/*      */     public d(ii this$0, iz ☃) {
/*  604 */       this.b = ☃;
/*      */     }
/*      */     
/*      */     public d a(buo ☃) {
/*  608 */       iz iz1 = this.b.c(ja.d, this.b.a(ja.i));
/*  609 */       vk vk = iy.e.a(☃, iz1, ii.a(this.a));
/*  610 */       ii.b(this.a).accept(ii.b(☃, vk));
/*  611 */       return this;
/*      */     }
/*      */     
/*      */     public d b(buo ☃) {
/*  615 */       vk vk = iy.e.a(☃, this.b, ii.a(this.a));
/*  616 */       ii.b(this.a).accept(ii.b(☃, vk));
/*  617 */       return this;
/*      */     }
/*      */     
/*      */     public d c(buo ☃) {
/*  621 */       vk vk1 = iy.e.a(☃, this.b, ii.a(this.a));
/*  622 */       vk vk2 = iy.f.a(☃, this.b, ii.a(this.a));
/*  623 */       ii.b(this.a).accept(ii.d(☃, vk1, vk2));
/*  624 */       return this;
/*      */     }
/*      */   }
/*      */ 
/*      */   
/*      */   private d j(buo ☃) {
/*  630 */     return new d(this, iz.l(☃));
/*      */   }
/*      */   
/*      */   private void k(buo ☃) {
/*  634 */     a(☃, ☃);
/*      */   }
/*      */   
/*      */   private void a(buo ☃, buo buo1) {
/*  638 */     this.a.accept(e(☃, iw.a(buo1)));
/*      */   }
/*      */   
/*      */   enum c {
/*  642 */     a, b;
/*      */     
/*      */     public ix a() {
/*  645 */       return (this == a) ? iy.T : iy.S;
/*      */     }
/*      */     
/*      */     public ix b() {
/*  649 */       return (this == a) ? iy.V : iy.U;
/*      */     }
/*      */   }
/*      */   
/*      */   private void a(buo ☃, c c1) {
/*  654 */     b(☃);
/*  655 */     b(☃, c1);
/*      */   }
/*      */   
/*      */   private void a(buo ☃, c c1, iz iz1) {
/*  659 */     b(☃);
/*  660 */     b(☃, c1, iz1);
/*      */   }
/*      */   
/*      */   private void b(buo ☃, c c1) {
/*  664 */     iz iz = iz.c(☃);
/*  665 */     b(☃, c1, iz);
/*      */   }
/*      */   
/*      */   private void b(buo ☃, c c1, iz iz1) {
/*  669 */     vk vk = c1.a().a(☃, iz1, this.b);
/*  670 */     this.a.accept(e(☃, vk));
/*      */   }
/*      */   
/*      */   private void a(buo ☃, buo buo1, c c1) {
/*  674 */     a(☃, c1);
/*      */     
/*  676 */     iz iz = iz.d(☃);
/*  677 */     vk vk = c1.b().a(buo1, iz, this.b);
/*  678 */     this.a.accept(e(buo1, vk));
/*      */   }
/*      */   
/*      */   private void b(buo ☃, buo buo1) {
/*  682 */     jb jb = jb.k.get(☃);
/*      */     
/*  684 */     vk vk1 = jb.a(☃, this.b);
/*  685 */     this.a.accept(e(☃, vk1));
/*      */     
/*  687 */     vk vk2 = iy.ac.a(buo1, jb.b(), this.b);
/*  688 */     this.a.accept(io.a(buo1, ir.a().a(is.c, vk2)).a(b()));
/*      */     
/*  690 */     b(☃);
/*      */   }
/*      */   
/*      */   private void c(buo ☃, buo buo1) {
/*  694 */     a(☃.h());
/*  695 */     iz iz1 = iz.g(☃);
/*  696 */     iz iz2 = iz.a(☃, buo1);
/*      */     
/*  698 */     vk vk = iy.ao.a(buo1, iz2, this.b);
/*  699 */     this.a.accept(
/*  700 */         io.a(buo1, ir.a()
/*  701 */           .a(is.c, vk))
/*  702 */         .a(ip.<gc>a(cex.O)
/*  703 */           .a(gc.e, ir.a())
/*  704 */           .a(gc.d, ir.a().a(is.b, is.a.d))
/*  705 */           .a(gc.c, ir.a().a(is.b, is.a.b))
/*  706 */           .a(gc.f, ir.a().a(is.b, is.a.c))));
/*      */ 
/*      */     
/*  709 */     this.a.accept(
/*  710 */         io.a(☃)
/*  711 */         .a(
/*  712 */           ip.<Comparable>a(cex.ai).a(integer -> ir.a().a(is.c, iy.an[integer.intValue()].a(☃, iz1, this.b)))));
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   private void a(buo ☃, buo buo1, buo buo2, buo buo3, buo buo4, buo buo5, buo buo6, buo buo7) {
/*  718 */     a(☃, c.b);
/*  719 */     a(buo1, c.b);
/*      */     
/*  721 */     e(buo2);
/*  722 */     e(buo3);
/*      */     
/*  724 */     b(buo4, buo6);
/*  725 */     b(buo5, buo7);
/*      */   }
/*      */   
/*      */   private void c(buo ☃, c c1) {
/*  729 */     a(☃, "_top");
/*  730 */     vk vk1 = a(☃, "_top", c1.a(), iz::c);
/*  731 */     vk vk2 = a(☃, "_bottom", c1.a(), iz::c);
/*  732 */     j(☃, vk1, vk2);
/*      */   }
/*      */   
/*      */   private void g() {
/*  736 */     a(bup.gU, "_front");
/*  737 */     vk ☃ = iw.a(bup.gU, "_top");
/*  738 */     vk vk1 = a(bup.gU, "_bottom", c.b.a(), iz::c);
/*  739 */     j(bup.gU, ☃, vk1);
/*      */   }
/*      */   
/*      */   private void h() {
/*  743 */     vk ☃ = a(bup.aV, "_top", iy.aE, iz::a);
/*  744 */     vk vk1 = a(bup.aV, "_bottom", iy.aE, iz::a);
/*  745 */     j(bup.aV, ☃, vk1);
/*      */   }
/*      */   
/*      */   private void j(buo ☃, vk vk1, vk vk2) {
/*  749 */     this.a.accept(io.a(☃)
/*  750 */         .a(
/*  751 */           ip.<cfd>a(cex.aa)
/*  752 */           .a(cfd.b, ir.a().a(is.c, vk2))
/*  753 */           .a(cfd.a, ir.a().a(is.c, vk1))));
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   private void l(buo ☃) {
/*  759 */     iz iz1 = iz.e(☃);
/*  760 */     iz iz2 = iz.e(iz.a(☃, "_corner"));
/*      */     
/*  762 */     vk vk1 = iy.W.a(☃, iz1, this.b);
/*  763 */     vk vk2 = iy.X.a(☃, iz2, this.b);
/*  764 */     vk vk3 = iy.Y.a(☃, iz1, this.b);
/*  765 */     vk vk4 = iy.Z.a(☃, iz1, this.b);
/*      */     
/*  767 */     b(☃);
/*  768 */     this.a.accept(io.a(☃)
/*  769 */         .a(
/*  770 */           ip.<cfk>a(cex.ac)
/*  771 */           .a(cfk.a, ir.a().a(is.c, vk1))
/*  772 */           .a(cfk.b, ir.a().<vk>a(is.c, vk1).a(is.b, is.a.b))
/*      */           
/*  774 */           .a(cfk.c, ir.a().<vk>a(is.c, vk3).a(is.b, is.a.b))
/*  775 */           .a(cfk.d, ir.a().<vk>a(is.c, vk4).a(is.b, is.a.b))
/*  776 */           .a(cfk.e, ir.a().a(is.c, vk3))
/*  777 */           .a(cfk.f, ir.a().a(is.c, vk4))
/*      */           
/*  779 */           .a(cfk.g, ir.a().a(is.c, vk2))
/*  780 */           .a(cfk.h, ir.a().<vk>a(is.c, vk2).a(is.b, is.a.b))
/*  781 */           .a(cfk.i, ir.a().<vk>a(is.c, vk2).a(is.b, is.a.c))
/*  782 */           .a(cfk.j, ir.a().<vk>a(is.c, vk2).a(is.b, is.a.d))));
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   private void m(buo ☃) {
/*  788 */     vk vk1 = a(☃, "", iy.W, iz::e);
/*  789 */     vk vk2 = a(☃, "", iy.Y, iz::e);
/*  790 */     vk vk3 = a(☃, "", iy.Z, iz::e);
/*      */     
/*  792 */     vk vk4 = a(☃, "_on", iy.W, iz::e);
/*  793 */     vk vk5 = a(☃, "_on", iy.Y, iz::e);
/*  794 */     vk vk6 = a(☃, "_on", iy.Z, iz::e);
/*      */ 
/*      */ 
/*      */     
/*  798 */     ip ip = ip.<Comparable, cfk>a(cex.w, cex.ad).a((bool, cfk1) -> {
/*      */           switch (null.b[cfk1.ordinal()]) {
/*      */             case 1:
/*      */               return ir.a().a(is.c, bool.booleanValue() ? ☃ : vk1);
/*      */             
/*      */             case 2:
/*      */               return ir.a().<vk>a(is.c, bool.booleanValue() ? ☃ : vk1).a(is.b, is.a.b);
/*      */             
/*      */             case 3:
/*      */               return ir.a().<vk>a(is.c, bool.booleanValue() ? vk2 : vk3).a(is.b, is.a.b);
/*      */             case 4:
/*      */               return ir.a().<vk>a(is.c, bool.booleanValue() ? vk4 : vk5).a(is.b, is.a.b);
/*      */             case 5:
/*      */               return ir.a().a(is.c, bool.booleanValue() ? vk2 : vk3);
/*      */             case 6:
/*      */               return ir.a().a(is.c, bool.booleanValue() ? vk4 : vk5);
/*      */           } 
/*      */           throw new UnsupportedOperationException("Fix you generator!");
/*      */         });
/*  817 */     b(☃);
/*  818 */     this.a.accept(io.a(☃).a(ip));
/*      */   }
/*      */   
/*      */   class a {
/*      */     private final vk b;
/*      */     
/*      */     public a(ii this$0, vk ☃, buo buo1) {
/*  825 */       this.b = iy.F.a(☃, iz.q(buo1), ii.a(this$0));
/*      */     }
/*      */     
/*      */     public a a(buo... ☃) {
/*  829 */       for (buo buo1 : ☃) {
/*  830 */         ii.b(this.a).accept(ii.a(buo1, this.b));
/*      */       }
/*  832 */       return this;
/*      */     }
/*      */     
/*      */     public a b(buo... ☃) {
/*  836 */       for (buo buo1 : ☃) {
/*  837 */         ii.a(this.a, buo1);
/*      */       }
/*  839 */       return a(☃);
/*      */     }
/*      */     
/*      */     public a a(ix ☃, buo... arrayOfBuo) {
/*  843 */       for (buo buo1 : arrayOfBuo) {
/*  844 */         ☃.a(iw.a(buo1.h()), iz.q(buo1), ii.a(this.a));
/*      */       }
/*  846 */       return a(arrayOfBuo);
/*      */     }
/*      */   }
/*      */   
/*      */   private a a(vk ☃, buo buo1) {
/*  851 */     return new a(this, ☃, buo1);
/*      */   }
/*      */   
/*      */   private a d(buo ☃, buo buo1) {
/*  855 */     return new a(this, iw.a(☃), buo1);
/*      */   }
/*      */   
/*      */   private void a(buo ☃, blx blx1) {
/*  859 */     vk vk = iy.F.a(☃, iz.a(blx1), this.b);
/*  860 */     this.a.accept(e(☃, vk));
/*      */   }
/*      */   
/*      */   private void h(buo ☃, vk vk1) {
/*  864 */     vk vk2 = iy.F.a(☃, iz.h(vk1), this.b);
/*  865 */     this.a.accept(e(☃, vk2));
/*      */   }
/*      */   
/*      */   private void e(buo ☃, buo buo1) {
/*  869 */     c(☃, jb.a);
/*      */ 
/*      */     
/*  872 */     vk vk = jb.i.get(☃).a(buo1, this.b);
/*  873 */     this.a.accept(e(buo1, vk));
/*      */   }
/*      */   
/*      */   private void a(jb.a ☃, buo... arrayOfBuo) {
/*  877 */     for (buo buo1 : arrayOfBuo) {
/*  878 */       vk vk = ☃.a(buo1, this.b);
/*  879 */       this.a.accept(d(buo1, vk));
/*      */     } 
/*      */   }
/*      */   
/*      */   private void b(jb.a ☃, buo... arrayOfBuo) {
/*  884 */     for (buo buo1 : arrayOfBuo) {
/*  885 */       vk vk = ☃.a(buo1, this.b);
/*  886 */       this.a.accept(
/*  887 */           io.a(buo1, ir.a().a(is.c, vk))
/*  888 */           .a(c()));
/*      */     } 
/*      */   }
/*      */ 
/*      */   
/*      */   private void f(buo ☃, buo buo1) {
/*  894 */     e(☃);
/*      */     
/*  896 */     iz iz = iz.b(☃, buo1);
/*  897 */     vk vk1 = iy.ai.a(buo1, iz, this.b);
/*  898 */     vk vk2 = iy.aj.a(buo1, iz, this.b);
/*  899 */     vk vk3 = iy.ak.a(buo1, iz, this.b);
/*  900 */     vk vk4 = iy.ag.a(buo1, iz, this.b);
/*  901 */     vk vk5 = iy.ah.a(buo1, iz, this.b);
/*      */     
/*  903 */     blx blx = buo1.h();
/*  904 */     iy.aK.a(iw.a(blx), iz.B(☃), this.b);
/*      */     
/*  906 */     this.a.accept(
/*  907 */         in.a(buo1)
/*  908 */         .a(ir.a().a(is.c, vk1))
/*  909 */         .a(im.a().a(cex.I, Boolean.valueOf(true)), ir.a().a(is.c, vk2))
/*  910 */         .a(im.a().a(cex.J, Boolean.valueOf(true)), ir.a().<vk>a(is.c, vk2).a(is.b, is.a.b))
/*  911 */         .a(im.a().a(cex.K, Boolean.valueOf(true)), ir.a().a(is.c, vk3))
/*  912 */         .a(im.a().a(cex.L, Boolean.valueOf(true)), ir.a().<vk>a(is.c, vk3).a(is.b, is.a.b))
/*      */         
/*  914 */         .a(im.a().a(cex.I, Boolean.valueOf(false)), ir.a().a(is.c, vk4))
/*  915 */         .a(im.a().a(cex.J, Boolean.valueOf(false)), ir.a().a(is.c, vk5))
/*  916 */         .a(im.a().a(cex.K, Boolean.valueOf(false)), ir.a().<vk>a(is.c, vk5).a(is.b, is.a.b))
/*  917 */         .a(im.a().a(cex.L, Boolean.valueOf(false)), ir.a().<vk>a(is.c, vk4).a(is.b, is.a.d)));
/*      */   }
/*      */ 
/*      */   
/*      */   private void n(buo ☃) {
/*  922 */     iz iz = iz.v(☃);
/*      */     
/*  924 */     vk vk1 = iy.al.a(☃, iz, this.b);
/*  925 */     vk vk2 = a(☃, "_conditional", iy.al, vk1 -> ☃.c(ja.i, vk1));
/*      */     
/*  927 */     this.a.accept(io.a(☃)
/*  928 */         .a(a(cex.c, vk2, vk1))
/*  929 */         .a(e()));
/*      */   }
/*      */ 
/*      */   
/*      */   private void o(buo ☃) {
/*  934 */     vk vk = jb.m.a(☃, this.b);
/*  935 */     this.a.accept(e(☃, vk).a(c()));
/*      */   }
/*      */   
/*      */   private List<ir> a(int ☃) {
/*  939 */     String str = "_age" + ☃;
/*  940 */     return (List<ir>)IntStream.range(1, 5)
/*  941 */       .mapToObj(i -> ir.a().a(is.c, iw.a(bup.kY, i + ☃)))
/*  942 */       .collect(Collectors.toList());
/*      */   }
/*      */   
/*      */   private void i() {
/*  946 */     a(bup.kY);
/*  947 */     this.a.accept(
/*  948 */         in.a(bup.kY)
/*  949 */         .a(im.a().a(cex.ae, Integer.valueOf(0)), a(0))
/*  950 */         .a(im.a().a(cex.ae, Integer.valueOf(1)), a(1))
/*  951 */         .a(im.a().a(cex.aN, ceu.b), 
/*  952 */           ir.a().a(is.c, iw.a(bup.kY, "_small_leaves")))
/*      */         
/*  954 */         .a(im.a().a(cex.aN, ceu.c), 
/*  955 */           ir.a().a(is.c, iw.a(bup.kY, "_large_leaves"))));
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   private ip j() {
/*  961 */     return ip.<gc>a(cex.M)
/*  962 */       .a(gc.a, ir.a().a(is.a, is.a.c))
/*  963 */       .a(gc.b, ir.a())
/*  964 */       .a(gc.c, ir.a().a(is.a, is.a.b))
/*  965 */       .a(gc.d, ir.a().<is.a>a(is.a, is.a.b).a(is.b, is.a.c))
/*  966 */       .a(gc.e, ir.a().<is.a>a(is.a, is.a.b).a(is.b, is.a.d))
/*  967 */       .a(gc.f, ir.a().<is.a>a(is.a, is.a.b).a(is.b, is.a.b));
/*      */   }
/*      */   
/*      */   private void k() {
/*  971 */     vk ☃ = iz.a(bup.lS, "_top_open");
/*      */     
/*  973 */     this.a.accept(
/*  974 */         io.a(bup.lS)
/*  975 */         .a(j())
/*  976 */         .a(ip.<Boolean>a(cex.u)
/*  977 */           .a(Boolean.valueOf(false), ir.a().a(is.c, jb.e.a(bup.lS, this.b)))
/*  978 */           .a(Boolean.valueOf(true), ir.a().a(is.c, jb.e.get(bup.lS).a(iz1 -> iz1.a(ja.f, ☃)).a(bup.lS, "_open", this.b)))));
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   private static <T extends Comparable<T>> ip a(cfj<T> ☃, T t, vk vk1, vk vk2) {
/*  984 */     ir ir1 = ir.a().a(is.c, vk1);
/*  985 */     ir ir2 = ir.a().a(is.c, vk2);
/*      */     
/*  987 */     return ip.<T>a(☃).a(comparable -> {
/*      */           boolean bool = (comparable.compareTo(☃) >= 0);
/*      */           return bool ? ir1 : ir2;
/*      */         });
/*      */   }
/*      */   
/*      */   private void a(buo ☃, Function<buo, iz> function) {
/*  994 */     iz iz1 = ((iz)function.apply(☃)).b(ja.i, ja.c);
/*  995 */     iz iz2 = iz1.c(ja.g, iz.a(☃, "_front_honey"));
/*      */     
/*  997 */     vk vk1 = iy.j.a(☃, iz1, this.b);
/*  998 */     vk vk2 = iy.j.a(☃, "_honey", iz2, this.b);
/*      */     
/* 1000 */     this.a.accept(
/* 1001 */         io.a(☃)
/* 1002 */         .a(b())
/* 1003 */         .a(a(cex.au, Integer.valueOf(5), vk2, vk1)));
/*      */   }
/*      */ 
/*      */   
/*      */   private void a(buo ☃, cfj<Integer> cfj1, int... arrayOfInt) {
/* 1008 */     if (cfj1.a().size() != arrayOfInt.length) {
/* 1009 */       throw new IllegalArgumentException();
/*      */     }
/*      */     
/* 1012 */     Int2ObjectOpenHashMap int2ObjectOpenHashMap = new Int2ObjectOpenHashMap();
/*      */     
/* 1014 */     ip ip = ip.<Integer>a(cfj1).a(integer -> {
/*      */           int i = ☃[integer.intValue()];
/*      */           
/*      */           vk vk = (vk)int2ObjectMap.computeIfAbsent(i, ());
/*      */           return ir.a().a(is.c, vk);
/*      */         });
/* 1020 */     a(☃.h());
/* 1021 */     this.a.accept(io.a(☃).a(ip));
/*      */   }
/*      */   
/*      */   private void l() {
/* 1025 */     vk ☃ = iw.a(bup.mb, "_floor");
/* 1026 */     vk vk1 = iw.a(bup.mb, "_ceiling");
/* 1027 */     vk vk2 = iw.a(bup.mb, "_wall");
/* 1028 */     vk vk3 = iw.a(bup.mb, "_between_walls");
/*      */     
/* 1030 */     a(bmd.rj);
/* 1031 */     this.a.accept(
/* 1032 */         io.a(bup.mb)
/* 1033 */         .a(
/* 1034 */           ip.<gc, cew>a(cex.O, cex.R)
/* 1035 */           .a(gc.c, cew.a, ir.a().a(is.c, ☃))
/* 1036 */           .a(gc.d, cew.a, ir.a().<vk>a(is.c, ☃).a(is.b, is.a.c))
/* 1037 */           .a(gc.f, cew.a, ir.a().<vk>a(is.c, ☃).a(is.b, is.a.b))
/* 1038 */           .a(gc.e, cew.a, ir.a().<vk>a(is.c, ☃).a(is.b, is.a.d))
/*      */           
/* 1040 */           .a(gc.c, cew.b, ir.a().a(is.c, vk1))
/* 1041 */           .a(gc.d, cew.b, ir.a().<vk>a(is.c, vk1).a(is.b, is.a.c))
/* 1042 */           .a(gc.f, cew.b, ir.a().<vk>a(is.c, vk1).a(is.b, is.a.b))
/* 1043 */           .a(gc.e, cew.b, ir.a().<vk>a(is.c, vk1).a(is.b, is.a.d))
/*      */           
/* 1045 */           .a(gc.c, cew.c, ir.a().<vk>a(is.c, vk2).a(is.b, is.a.d))
/* 1046 */           .a(gc.d, cew.c, ir.a().<vk>a(is.c, vk2).a(is.b, is.a.b))
/* 1047 */           .a(gc.f, cew.c, ir.a().a(is.c, vk2))
/* 1048 */           .a(gc.e, cew.c, ir.a().<vk>a(is.c, vk2).a(is.b, is.a.c))
/*      */           
/* 1050 */           .a(gc.d, cew.d, ir.a().<vk>a(is.c, vk3).a(is.b, is.a.b))
/* 1051 */           .a(gc.c, cew.d, ir.a().<vk>a(is.c, vk3).a(is.b, is.a.d))
/* 1052 */           .a(gc.f, cew.d, ir.a().a(is.c, vk3))
/* 1053 */           .a(gc.e, cew.d, ir.a().<vk>a(is.c, vk3).a(is.b, is.a.c))));
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   private void m() {
/* 1059 */     this.a.accept(
/* 1060 */         io.a(bup.lX, ir.a().a(is.c, iw.a(bup.lX)))
/* 1061 */         .a(
/* 1062 */           ip.<cet, gc>a(cex.Q, cex.O)
/* 1063 */           .a(cet.a, gc.c, ir.a())
/* 1064 */           .a(cet.a, gc.f, ir.a().a(is.b, is.a.b))
/* 1065 */           .a(cet.a, gc.d, ir.a().a(is.b, is.a.c))
/* 1066 */           .a(cet.a, gc.e, ir.a().a(is.b, is.a.d))
/*      */           
/* 1068 */           .a(cet.b, gc.c, ir.a().a(is.a, is.a.b))
/* 1069 */           .a(cet.b, gc.f, ir.a().<is.a>a(is.a, is.a.b).a(is.b, is.a.b))
/* 1070 */           .a(cet.b, gc.d, ir.a().<is.a>a(is.a, is.a.b).a(is.b, is.a.c))
/* 1071 */           .a(cet.b, gc.e, ir.a().<is.a>a(is.a, is.a.b).a(is.b, is.a.d))
/*      */           
/* 1073 */           .a(cet.c, gc.d, ir.a().a(is.a, is.a.c))
/* 1074 */           .a(cet.c, gc.e, ir.a().<is.a>a(is.a, is.a.c).a(is.b, is.a.b))
/* 1075 */           .a(cet.c, gc.c, ir.a().<is.a>a(is.a, is.a.c).a(is.b, is.a.c))
/* 1076 */           .a(cet.c, gc.f, ir.a().<is.a>a(is.a, is.a.c).a(is.b, is.a.d))));
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   private void e(buo ☃, jb.a a1) {
/* 1082 */     vk vk1 = a1.a(☃, this.b);
/*      */     
/* 1084 */     vk vk2 = iz.a(☃, "_front_on");
/* 1085 */     vk vk3 = a1.get(☃).a(iz1 -> iz1.a(ja.g, ☃)).a(☃, "_on", this.b);
/*      */     
/* 1087 */     this.a.accept(
/* 1088 */         io.a(☃)
/* 1089 */         .a(a(cex.r, vk3, vk1))
/* 1090 */         .a(b()));
/*      */   }
/*      */ 
/*      */   
/*      */   private void a(buo... ☃) {
/* 1095 */     vk vk = iw.a("campfire_off");
/*      */     
/* 1097 */     for (buo buo1 : ☃) {
/* 1098 */       vk vk1 = iy.aw.a(buo1, iz.A(buo1), this.b);
/*      */       
/* 1100 */       a(buo1.h());
/* 1101 */       this.a.accept(
/* 1102 */           io.a(buo1)
/* 1103 */           .a(a(cex.r, vk1, vk))
/* 1104 */           .a(c()));
/*      */     } 
/*      */   }
/*      */ 
/*      */   
/*      */   private void n() {
/* 1110 */     iz ☃ = iz.a(iz.C(bup.bI), iz.C(bup.n));
/* 1111 */     vk vk = iy.e.a(bup.bI, ☃, this.b);
/* 1112 */     this.a.accept(e(bup.bI, vk));
/*      */   }
/*      */   
/*      */   private void o() {
/* 1116 */     a(bmd.lP);
/* 1117 */     this.a.accept(
/* 1118 */         in.a(bup.bS)
/* 1119 */         .a(
/* 1120 */           im.b(new im[] {
/* 1121 */               im.a()
/* 1122 */               .<cfl>a(cex.X, cfl.c)
/* 1123 */               .<cfl>a(cex.W, cfl.c)
/* 1124 */               .<cfl>a(cex.Y, cfl.c)
/* 1125 */               .a(cex.Z, cfl.c), 
/* 1126 */               im.a()
/* 1127 */               .<cfl>a(cex.X, cfl.b, new cfl[] { cfl.a
/* 1128 */                 }).a(cex.W, cfl.b, new cfl[] { cfl.a
/* 1129 */                 }), im.a()
/* 1130 */               .<cfl>a(cex.W, cfl.b, new cfl[] { cfl.a
/* 1131 */                 }).a(cex.Y, cfl.b, new cfl[] { cfl.a
/* 1132 */                 }), im.a()
/* 1133 */               .<cfl>a(cex.Y, cfl.b, new cfl[] { cfl.a
/* 1134 */                 }).a(cex.Z, cfl.b, new cfl[] { cfl.a
/* 1135 */                 }), im.a()
/* 1136 */               .<cfl>a(cex.Z, cfl.b, new cfl[] { cfl.a
/* 1137 */                 }).a(cex.X, cfl.b, new cfl[] { cfl.a
/*      */                 })
/* 1139 */             }), ir.a().a(is.c, iw.a("redstone_dust_dot")))
/*      */         
/* 1141 */         .a(
/* 1142 */           im.a()
/* 1143 */           .a(cex.X, cfl.b, new cfl[] { cfl.a
/* 1144 */             }), ir.a().a(is.c, iw.a("redstone_dust_side0")))
/*      */         
/* 1146 */         .a(
/* 1147 */           im.a()
/* 1148 */           .a(cex.Y, cfl.b, new cfl[] { cfl.a
/* 1149 */             }), ir.a().a(is.c, iw.a("redstone_dust_side_alt0")))
/*      */         
/* 1151 */         .a(
/* 1152 */           im.a()
/* 1153 */           .a(cex.W, cfl.b, new cfl[] { cfl.a
/* 1154 */             }), ir.a().<vk>a(is.c, iw.a("redstone_dust_side_alt1")).a(is.b, is.a.d))
/*      */         
/* 1156 */         .a(
/* 1157 */           im.a()
/* 1158 */           .a(cex.Z, cfl.b, new cfl[] { cfl.a
/* 1159 */             }), ir.a().<vk>a(is.c, iw.a("redstone_dust_side1")).a(is.b, is.a.d))
/*      */         
/* 1161 */         .a(
/* 1162 */           im.a().a(cex.X, cfl.a), 
/* 1163 */           ir.a().a(is.c, iw.a("redstone_dust_up")))
/*      */         
/* 1165 */         .a(
/* 1166 */           im.a().a(cex.W, cfl.a), 
/* 1167 */           ir.a().<vk>a(is.c, iw.a("redstone_dust_up")).a(is.b, is.a.b))
/*      */         
/* 1169 */         .a(
/* 1170 */           im.a().a(cex.Y, cfl.a), 
/* 1171 */           ir.a().<vk>a(is.c, iw.a("redstone_dust_up")).a(is.b, is.a.c))
/*      */         
/* 1173 */         .a(
/* 1174 */           im.a().a(cex.Z, cfl.a), 
/* 1175 */           ir.a().<vk>a(is.c, iw.a("redstone_dust_up")).a(is.b, is.a.d)));
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   private void p() {
/* 1181 */     a(bmd.jV);
/* 1182 */     this.a.accept(
/* 1183 */         io.a(bup.fu)
/* 1184 */         .a(c())
/* 1185 */         .a(
/* 1186 */           ip.<cfa, Boolean>a(cex.aG, cex.w)
/* 1187 */           .a(cfa.a, Boolean.valueOf(false), ir.a().a(is.c, iw.a(bup.fu)))
/* 1188 */           .a(cfa.a, Boolean.valueOf(true), ir.a().a(is.c, iw.a(bup.fu, "_on")))
/* 1189 */           .a(cfa.b, Boolean.valueOf(false), ir.a().a(is.c, iw.a(bup.fu, "_subtract")))
/* 1190 */           .a(cfa.b, Boolean.valueOf(true), ir.a().a(is.c, iw.a(bup.fu, "_on_subtract")))));
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   private void q() {
/* 1196 */     iz ☃ = iz.a(bup.id);
/* 1197 */     iz iz1 = iz.a(
/* 1198 */         iz.a(bup.hR, "_side"), ☃
/* 1199 */         .a(ja.f));
/*      */     
/* 1201 */     vk vk1 = iy.G.a(bup.hR, iz1, this.b);
/* 1202 */     vk vk2 = iy.H.a(bup.hR, iz1, this.b);
/* 1203 */     vk vk3 = iy.e.b(bup.hR, "_double", iz1, this.b);
/* 1204 */     this.a.accept(h(bup.hR, vk1, vk2, vk3));
/* 1205 */     this.a.accept(e(bup.id, iy.c.a(bup.id, ☃, this.b)));
/*      */   }
/*      */   
/*      */   private void r() {
/* 1209 */     a(bmd.nB);
/* 1210 */     this.a.accept(
/* 1211 */         in.a(bup.ea)
/* 1212 */         .a(ir.a().a(is.c, iz.C(bup.ea)))
/* 1213 */         .a(im.a().a(cex.k, Boolean.valueOf(true)), ir.a().a(is.c, iz.a(bup.ea, "_bottle0")))
/* 1214 */         .a(im.a().a(cex.l, Boolean.valueOf(true)), ir.a().a(is.c, iz.a(bup.ea, "_bottle1")))
/* 1215 */         .a(im.a().a(cex.m, Boolean.valueOf(true)), ir.a().a(is.c, iz.a(bup.ea, "_bottle2")))
/*      */         
/* 1217 */         .a(im.a().a(cex.k, Boolean.valueOf(false)), ir.a().a(is.c, iz.a(bup.ea, "_empty0")))
/* 1218 */         .a(im.a().a(cex.l, Boolean.valueOf(false)), ir.a().a(is.c, iz.a(bup.ea, "_empty1")))
/* 1219 */         .a(im.a().a(cex.m, Boolean.valueOf(false)), ir.a().a(is.c, iz.a(bup.ea, "_empty2"))));
/*      */   }
/*      */ 
/*      */   
/*      */   private void p(buo ☃) {
/* 1224 */     vk vk1 = iy.aJ.a(☃, iz.b(☃), this.b);
/* 1225 */     vk vk2 = iw.a("mushroom_block_inside");
/*      */     
/* 1227 */     this.a.accept(
/* 1228 */         in.a(☃)
/* 1229 */         .a(im.a().a(cex.I, Boolean.valueOf(true)), ir.a().a(is.c, vk1))
/* 1230 */         .a(im.a().a(cex.J, Boolean.valueOf(true)), ir.a().<vk>a(is.c, vk1).<is.a>a(is.b, is.a.b).a(is.d, Boolean.valueOf(true)))
/* 1231 */         .a(im.a().a(cex.K, Boolean.valueOf(true)), ir.a().<vk>a(is.c, vk1).<is.a>a(is.b, is.a.c).a(is.d, Boolean.valueOf(true)))
/* 1232 */         .a(im.a().a(cex.L, Boolean.valueOf(true)), ir.a().<vk>a(is.c, vk1).<is.a>a(is.b, is.a.d).a(is.d, Boolean.valueOf(true)))
/* 1233 */         .a(im.a().a(cex.G, Boolean.valueOf(true)), ir.a().<vk>a(is.c, vk1).<is.a>a(is.a, is.a.d).a(is.d, Boolean.valueOf(true)))
/* 1234 */         .a(im.a().a(cex.H, Boolean.valueOf(true)), ir.a().<vk>a(is.c, vk1).<is.a>a(is.a, is.a.b).a(is.d, Boolean.valueOf(true)))
/*      */         
/* 1236 */         .a(im.a().a(cex.I, Boolean.valueOf(false)), ir.a().a(is.c, vk2))
/* 1237 */         .a(im.a().a(cex.J, Boolean.valueOf(false)), ir.a().<vk>a(is.c, vk2).<is.a>a(is.b, is.a.b).a(is.d, Boolean.valueOf(false)))
/* 1238 */         .a(im.a().a(cex.K, Boolean.valueOf(false)), ir.a().<vk>a(is.c, vk2).<is.a>a(is.b, is.a.c).a(is.d, Boolean.valueOf(false)))
/* 1239 */         .a(im.a().a(cex.L, Boolean.valueOf(false)), ir.a().<vk>a(is.c, vk2).<is.a>a(is.b, is.a.d).a(is.d, Boolean.valueOf(false)))
/* 1240 */         .a(im.a().a(cex.G, Boolean.valueOf(false)), ir.a().<vk>a(is.c, vk2).<is.a>a(is.a, is.a.d).a(is.d, Boolean.valueOf(false)))
/* 1241 */         .a(im.a().a(cex.H, Boolean.valueOf(false)), ir.a().<vk>a(is.c, vk2).<is.a>a(is.a, is.a.b).a(is.d, Boolean.valueOf(false))));
/*      */ 
/*      */     
/* 1244 */     c(☃, jb.a.a(☃, "_inventory", this.b));
/*      */   }
/*      */   
/*      */   private void s() {
/* 1248 */     a(bmd.mN);
/* 1249 */     this.a.accept(
/* 1250 */         io.a(bup.cW)
/* 1251 */         .a(
/* 1252 */           ip.<Integer>a(cex.al)
/* 1253 */           .a(Integer.valueOf(0), ir.a().a(is.c, iw.a(bup.cW)))
/* 1254 */           .a(Integer.valueOf(1), ir.a().a(is.c, iw.a(bup.cW, "_slice1")))
/* 1255 */           .a(Integer.valueOf(2), ir.a().a(is.c, iw.a(bup.cW, "_slice2")))
/* 1256 */           .a(Integer.valueOf(3), ir.a().a(is.c, iw.a(bup.cW, "_slice3")))
/* 1257 */           .a(Integer.valueOf(4), ir.a().a(is.c, iw.a(bup.cW, "_slice4")))
/* 1258 */           .a(Integer.valueOf(5), ir.a().a(is.c, iw.a(bup.cW, "_slice5")))
/* 1259 */           .a(Integer.valueOf(6), ir.a().a(is.c, iw.a(bup.cW, "_slice6")))));
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private void t() {
/* 1272 */     iz ☃ = (new iz()).a(ja.c, iz.a(bup.lV, "_side3")).a(ja.o, iz.C(bup.s)).a(ja.n, iz.a(bup.lV, "_top")).a(ja.j, iz.a(bup.lV, "_side3")).a(ja.l, iz.a(bup.lV, "_side3")).a(ja.k, iz.a(bup.lV, "_side1")).a(ja.m, iz.a(bup.lV, "_side2"));
/*      */     
/* 1274 */     this.a.accept(e(bup.lV, iy.a.a(bup.lV, ☃, this.b)));
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private void u() {
/* 1285 */     iz ☃ = (new iz()).a(ja.c, iz.a(bup.lZ, "_front")).a(ja.o, iz.a(bup.lZ, "_bottom")).a(ja.n, iz.a(bup.lZ, "_top")).a(ja.j, iz.a(bup.lZ, "_front")).a(ja.k, iz.a(bup.lZ, "_front")).a(ja.l, iz.a(bup.lZ, "_side")).a(ja.m, iz.a(bup.lZ, "_side"));
/*      */     
/* 1287 */     this.a.accept(e(bup.lZ, iy.a.a(bup.lZ, ☃, this.b)));
/*      */   }
/*      */   
/*      */   private void a(buo ☃, buo buo1, BiFunction<buo, buo, iz> biFunction) {
/* 1291 */     iz iz = biFunction.apply(☃, buo1);
/* 1292 */     this.a.accept(e(☃, iy.a.a(☃, iz, this.b)));
/*      */   }
/*      */   
/*      */   private void v() {
/* 1296 */     iz ☃ = iz.j(bup.cK);
/*      */     
/* 1298 */     this.a.accept(e(bup.cK, iw.a(bup.cK)));
/*      */     
/* 1300 */     a(bup.cU, ☃);
/* 1301 */     a(bup.cV, ☃);
/*      */   }
/*      */   
/*      */   private void a(buo ☃, iz iz1) {
/* 1305 */     vk vk = iy.i.a(☃, iz1.c(ja.g, iz.C(☃)), this.b);
/* 1306 */     this.a.accept(io.a(☃, ir.a().a(is.c, vk)).a(b()));
/*      */   }
/*      */   
/*      */   private void w() {
/* 1310 */     a(bmd.nC);
/* 1311 */     this.a.accept(
/* 1312 */         io.a(bup.eb)
/* 1313 */         .a(
/* 1314 */           ip.<Integer>a(cex.ar)
/* 1315 */           .a(Integer.valueOf(0), ir.a().a(is.c, iw.a(bup.eb)))
/* 1316 */           .a(Integer.valueOf(1), ir.a().a(is.c, iw.a(bup.eb, "_level1")))
/* 1317 */           .a(Integer.valueOf(2), ir.a().a(is.c, iw.a(bup.eb, "_level2")))
/* 1318 */           .a(Integer.valueOf(3), ir.a().a(is.c, iw.a(bup.eb, "_level3")))));
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private void g(buo ☃, buo buo1) {
/* 1326 */     iz iz = (new iz()).a(ja.d, iz.a(buo1, "_top")).a(ja.i, iz.C(☃));
/*      */     
/* 1328 */     a(☃, iz, iy.e);
/*      */   }
/*      */   
/*      */   private void x() {
/* 1332 */     iz ☃ = iz.b(bup.iy);
/* 1333 */     vk vk1 = iy.ae.a(bup.iy, ☃, this.b);
/* 1334 */     vk vk2 = a(bup.iy, "_dead", iy.ae, vk1 -> ☃.c(ja.b, vk1));
/*      */     
/* 1336 */     this.a.accept(
/* 1337 */         io.a(bup.iy)
/* 1338 */         .a(a(cex.ah, Integer.valueOf(5), vk2, vk1)));
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private void q(buo ☃) {
/* 1346 */     iz iz1 = (new iz()).a(ja.f, iz.a(bup.bY, "_top")).a(ja.i, iz.a(bup.bY, "_side")).a(ja.g, iz.a(☃, "_front"));
/*      */ 
/*      */ 
/*      */     
/* 1350 */     iz iz2 = (new iz()).a(ja.i, iz.a(bup.bY, "_top")).a(ja.g, iz.a(☃, "_front_vertical"));
/*      */     
/* 1352 */     vk vk1 = iy.i.a(☃, iz1, this.b);
/* 1353 */     vk vk2 = iy.k.a(☃, iz2, this.b);
/*      */     
/* 1355 */     this.a.accept(
/* 1356 */         io.a(☃)
/* 1357 */         .a(
/* 1358 */           ip.<gc>a(cex.M)
/* 1359 */           .a(gc.a, ir.a().<vk>a(is.c, vk2).a(is.a, is.a.c))
/* 1360 */           .a(gc.b, ir.a().a(is.c, vk2))
/*      */           
/* 1362 */           .a(gc.c, ir.a().a(is.c, vk1))
/* 1363 */           .a(gc.f, ir.a().<vk>a(is.c, vk1).a(is.b, is.a.b))
/* 1364 */           .a(gc.d, ir.a().<vk>a(is.c, vk1).a(is.b, is.a.c))
/* 1365 */           .a(gc.e, ir.a().<vk>a(is.c, vk1).a(is.b, is.a.d))));
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private void y() {
/* 1372 */     vk ☃ = iw.a(bup.ed);
/* 1373 */     vk vk1 = iw.a(bup.ed, "_filled");
/*      */     
/* 1375 */     this.a.accept(
/* 1376 */         io.a(bup.ed)
/* 1377 */         .a(
/* 1378 */           ip.<Boolean>a(cex.h)
/* 1379 */           .a(Boolean.valueOf(false), ir.a().a(is.c, ☃))
/* 1380 */           .a(Boolean.valueOf(true), ir.a().a(is.c, vk1)))
/*      */         
/* 1382 */         .a(
/* 1383 */           c()));
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   private void z() {
/* 1389 */     vk ☃ = iw.a(bup.ix, "_side");
/* 1390 */     vk vk1 = iw.a(bup.ix, "_noside");
/* 1391 */     vk vk2 = iw.a(bup.ix, "_noside1");
/* 1392 */     vk vk3 = iw.a(bup.ix, "_noside2");
/* 1393 */     vk vk4 = iw.a(bup.ix, "_noside3");
/*      */     
/* 1395 */     this.a.accept(
/* 1396 */         in.a(bup.ix)
/* 1397 */         .a(im.a().a(cex.I, Boolean.valueOf(true)), ir.a().a(is.c, ☃))
/* 1398 */         .a(im.a().a(cex.J, Boolean.valueOf(true)), ir.a().<vk>a(is.c, ☃).<is.a>a(is.b, is.a.b).a(is.d, Boolean.valueOf(true)))
/* 1399 */         .a(im.a().a(cex.K, Boolean.valueOf(true)), ir.a().<vk>a(is.c, ☃).<is.a>a(is.b, is.a.c).a(is.d, Boolean.valueOf(true)))
/* 1400 */         .a(im.a().a(cex.L, Boolean.valueOf(true)), ir.a().<vk>a(is.c, ☃).<is.a>a(is.b, is.a.d).a(is.d, Boolean.valueOf(true)))
/* 1401 */         .a(im.a().a(cex.G, Boolean.valueOf(true)), ir.a().<vk>a(is.c, ☃).<is.a>a(is.a, is.a.d).a(is.d, Boolean.valueOf(true)))
/* 1402 */         .a(im.a().a(cex.H, Boolean.valueOf(true)), ir.a().<vk>a(is.c, ☃).<is.a>a(is.a, is.a.b).a(is.d, Boolean.valueOf(true)))
/*      */         
/* 1404 */         .a(im.a().a(cex.I, Boolean.valueOf(false)), new ir[] {
/* 1405 */             ir.a().<vk>a(is.c, vk1).a(is.e, Integer.valueOf(2)), 
/* 1406 */             ir.a().a(is.c, vk2), 
/* 1407 */             ir.a().a(is.c, vk3), 
/* 1408 */             ir.a().a(is.c, vk4)
/*      */ 
/*      */           
/* 1411 */           }).a(im.a().a(cex.J, Boolean.valueOf(false)), new ir[] {
/* 1412 */             ir.a().<vk>a(is.c, vk2).<is.a>a(is.b, is.a.b).a(is.d, Boolean.valueOf(true)), 
/* 1413 */             ir.a().<vk>a(is.c, vk3).<is.a>a(is.b, is.a.b).a(is.d, Boolean.valueOf(true)), 
/* 1414 */             ir.a().<vk>a(is.c, vk4).<is.a>a(is.b, is.a.b).a(is.d, Boolean.valueOf(true)), 
/* 1415 */             ir.a().<vk>a(is.c, vk1).<Integer>a(is.e, Integer.valueOf(2)).<is.a>a(is.b, is.a.b).a(is.d, Boolean.valueOf(true))
/*      */ 
/*      */           
/* 1418 */           }).a(im.a().a(cex.K, Boolean.valueOf(false)), new ir[] {
/* 1419 */             ir.a().<vk>a(is.c, vk3).<is.a>a(is.b, is.a.c).a(is.d, Boolean.valueOf(true)), 
/* 1420 */             ir.a().<vk>a(is.c, vk4).<is.a>a(is.b, is.a.c).a(is.d, Boolean.valueOf(true)), 
/* 1421 */             ir.a().<vk>a(is.c, vk1).<Integer>a(is.e, Integer.valueOf(2)).<is.a>a(is.b, is.a.c).a(is.d, Boolean.valueOf(true)), 
/* 1422 */             ir.a().<vk>a(is.c, vk2).<is.a>a(is.b, is.a.c).a(is.d, Boolean.valueOf(true))
/*      */ 
/*      */           
/* 1425 */           }).a(im.a().a(cex.L, Boolean.valueOf(false)), new ir[] {
/* 1426 */             ir.a().<vk>a(is.c, vk4).<is.a>a(is.b, is.a.d).a(is.d, Boolean.valueOf(true)), 
/* 1427 */             ir.a().<vk>a(is.c, vk1).<Integer>a(is.e, Integer.valueOf(2)).<is.a>a(is.b, is.a.d).a(is.d, Boolean.valueOf(true)), 
/* 1428 */             ir.a().<vk>a(is.c, vk2).<is.a>a(is.b, is.a.d).a(is.d, Boolean.valueOf(true)), 
/* 1429 */             ir.a().<vk>a(is.c, vk3).<is.a>a(is.b, is.a.d).a(is.d, Boolean.valueOf(true))
/*      */ 
/*      */           
/* 1432 */           }).a(im.a().a(cex.G, Boolean.valueOf(false)), new ir[] {
/* 1433 */             ir.a().<vk>a(is.c, vk1).<Integer>a(is.e, Integer.valueOf(2)).<is.a>a(is.a, is.a.d).a(is.d, Boolean.valueOf(true)), 
/* 1434 */             ir.a().<vk>a(is.c, vk4).<is.a>a(is.a, is.a.d).a(is.d, Boolean.valueOf(true)), 
/* 1435 */             ir.a().<vk>a(is.c, vk2).<is.a>a(is.a, is.a.d).a(is.d, Boolean.valueOf(true)), 
/* 1436 */             ir.a().<vk>a(is.c, vk3).<is.a>a(is.a, is.a.d).a(is.d, Boolean.valueOf(true))
/*      */ 
/*      */           
/* 1439 */           }).a(im.a().a(cex.H, Boolean.valueOf(false)), new ir[] {
/* 1440 */             ir.a().<vk>a(is.c, vk4).<is.a>a(is.a, is.a.b).a(is.d, Boolean.valueOf(true)), 
/* 1441 */             ir.a().<vk>a(is.c, vk3).<is.a>a(is.a, is.a.b).a(is.d, Boolean.valueOf(true)), 
/* 1442 */             ir.a().<vk>a(is.c, vk2).<is.a>a(is.a, is.a.b).a(is.d, Boolean.valueOf(true)), 
/* 1443 */             ir.a().<vk>a(is.c, vk1).<Integer>a(is.e, Integer.valueOf(2)).<is.a>a(is.a, is.a.b).a(is.d, Boolean.valueOf(true))
/*      */           }));
/*      */   }
/*      */ 
/*      */   
/*      */   private void A() {
/* 1449 */     this.a.accept(in.a(bup.na)
/* 1450 */         .a(ir.a().a(is.c, iz.C(bup.na)))
/* 1451 */         .a(im.a().a(cex.as, Integer.valueOf(1)), ir.a().a(is.c, iz.a(bup.na, "_contents1")))
/* 1452 */         .a(im.a().a(cex.as, Integer.valueOf(2)), ir.a().a(is.c, iz.a(bup.na, "_contents2")))
/* 1453 */         .a(im.a().a(cex.as, Integer.valueOf(3)), ir.a().a(is.c, iz.a(bup.na, "_contents3")))
/* 1454 */         .a(im.a().a(cex.as, Integer.valueOf(4)), ir.a().a(is.c, iz.a(bup.na, "_contents4")))
/* 1455 */         .a(im.a().a(cex.as, Integer.valueOf(5)), ir.a().a(is.c, iz.a(bup.na, "_contents5")))
/* 1456 */         .a(im.a().a(cex.as, Integer.valueOf(6)), ir.a().a(is.c, iz.a(bup.na, "_contents6")))
/* 1457 */         .a(im.a().a(cex.as, Integer.valueOf(7)), ir.a().a(is.c, iz.a(bup.na, "_contents7")))
/* 1458 */         .a(im.a().a(cex.as, Integer.valueOf(8)), ir.a().a(is.c, iz.a(bup.na, "_contents_ready"))));
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private void r(buo ☃) {
/* 1467 */     iz iz = (new iz()).a(ja.e, iz.C(bup.cL)).a(ja.f, iz.C(☃)).a(ja.i, iz.a(☃, "_side"));
/*      */     
/* 1469 */     this.a.accept(e(☃, iy.h.a(☃, iz, this.b)));
/*      */   }
/*      */   
/*      */   private void B() {
/* 1473 */     vk ☃ = iz.a(bup.fv, "_side");
/* 1474 */     iz iz1 = (new iz()).a(ja.f, iz.a(bup.fv, "_top")).a(ja.i, ☃);
/* 1475 */     iz iz2 = (new iz()).a(ja.f, iz.a(bup.fv, "_inverted_top")).a(ja.i, ☃);
/*      */     
/* 1477 */     this.a.accept(
/* 1478 */         io.a(bup.fv)
/* 1479 */         .a(
/* 1480 */           ip.<Boolean>a(cex.p)
/* 1481 */           .a(Boolean.valueOf(false), ir.a().a(is.c, iy.af.a(bup.fv, iz1, this.b)))
/* 1482 */           .a(Boolean.valueOf(true), ir.a().a(is.c, iy.af.a(iw.a(bup.fv, "_inverted"), iz2, this.b)))));
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   private void s(buo ☃) {
/* 1488 */     this.a.accept(
/* 1489 */         io.a(☃, ir.a().a(is.c, iw.a(☃)))
/* 1490 */         .a(j()));
/*      */   }
/*      */ 
/*      */   
/*      */   private void C() {
/* 1495 */     iz ☃ = (new iz()).a(ja.B, iz.C(bup.j)).a(ja.f, iz.C(bup.bX));
/* 1496 */     iz iz1 = (new iz()).a(ja.B, iz.C(bup.j)).a(ja.f, iz.a(bup.bX, "_moist"));
/*      */     
/* 1498 */     vk vk1 = iy.aq.a(bup.bX, ☃, this.b);
/* 1499 */     vk vk2 = iy.aq.a(iz.a(bup.bX, "_moist"), iz1, this.b);
/*      */     
/* 1501 */     this.a.accept(
/* 1502 */         io.a(bup.bX)
/* 1503 */         .a(a(cex.aw, Integer.valueOf(7), vk2, vk1)));
/*      */   }
/*      */ 
/*      */   
/*      */   private List<vk> t(buo ☃) {
/* 1508 */     vk vk1 = iy.ar.a(iw.a(☃, "_floor0"), iz.r(☃), this.b);
/* 1509 */     vk vk2 = iy.ar.a(iw.a(☃, "_floor1"), iz.s(☃), this.b);
/*      */     
/* 1511 */     return (List<vk>)ImmutableList.of(vk1, vk2);
/*      */   }
/*      */   
/*      */   private List<vk> u(buo ☃) {
/* 1515 */     vk vk1 = iy.as.a(iw.a(☃, "_side0"), iz.r(☃), this.b);
/* 1516 */     vk vk2 = iy.as.a(iw.a(☃, "_side1"), iz.s(☃), this.b);
/*      */     
/* 1518 */     vk vk3 = iy.at.a(iw.a(☃, "_side_alt0"), iz.r(☃), this.b);
/* 1519 */     vk vk4 = iy.at.a(iw.a(☃, "_side_alt1"), iz.s(☃), this.b);
/*      */     
/* 1521 */     return (List<vk>)ImmutableList.of(vk1, vk2, vk3, vk4);
/*      */   }
/*      */   
/*      */   private List<vk> v(buo ☃) {
/* 1525 */     vk vk1 = iy.au.a(iw.a(☃, "_up0"), iz.r(☃), this.b);
/* 1526 */     vk vk2 = iy.au.a(iw.a(☃, "_up1"), iz.s(☃), this.b);
/*      */     
/* 1528 */     vk vk3 = iy.av.a(iw.a(☃, "_up_alt0"), iz.r(☃), this.b);
/* 1529 */     vk vk4 = iy.av.a(iw.a(☃, "_up_alt1"), iz.s(☃), this.b);
/*      */     
/* 1531 */     return (List<vk>)ImmutableList.of(vk1, vk2, vk3, vk4);
/*      */   }
/*      */   
/*      */   private static List<ir> a(List<vk> ☃, UnaryOperator<ir> unaryOperator) {
/* 1535 */     return (List<ir>)☃.stream().map(☃ -> ir.a().a(is.c, ☃)).map(unaryOperator).collect(Collectors.toList());
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private void D() {
/* 1544 */     im ☃ = im.a().<Boolean>a(cex.I, Boolean.valueOf(false)).<Boolean>a(cex.J, Boolean.valueOf(false)).<Boolean>a(cex.K, Boolean.valueOf(false)).<Boolean>a(cex.L, Boolean.valueOf(false)).a(cex.G, Boolean.valueOf(false));
/* 1545 */     List<vk> list1 = t(bup.bN);
/* 1546 */     List<vk> list2 = u(bup.bN);
/* 1547 */     List<vk> list3 = v(bup.bN);
/*      */     
/* 1549 */     this.a.accept(
/* 1550 */         in.a(bup.bN)
/* 1551 */         .a(☃, 
/*      */           
/* 1553 */           a(list1, ☃ -> ☃))
/*      */         
/* 1555 */         .a(
/* 1556 */           im.b(new im[] { im.a().a(cex.I, Boolean.valueOf(true)), ☃
/* 1557 */             }), a(list2, ☃ -> ☃))
/*      */         
/* 1559 */         .a(
/* 1560 */           im.b(new im[] { im.a().a(cex.J, Boolean.valueOf(true)), ☃
/* 1561 */             }), a(list2, ☃ -> ☃.a(is.b, is.a.b)))
/*      */         
/* 1563 */         .a(
/* 1564 */           im.b(new im[] { im.a().a(cex.K, Boolean.valueOf(true)), ☃
/* 1565 */             }), a(list2, ☃ -> ☃.a(is.b, is.a.c)))
/*      */         
/* 1567 */         .a(
/* 1568 */           im.b(new im[] { im.a().a(cex.L, Boolean.valueOf(true)), ☃
/* 1569 */             }), a(list2, ☃ -> ☃.a(is.b, is.a.d)))
/*      */         
/* 1571 */         .a(
/* 1572 */           im.a().a(cex.G, Boolean.valueOf(true)), 
/* 1573 */           a(list3, ☃ -> ☃)));
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   private void E() {
/* 1579 */     List<vk> ☃ = t(bup.bO);
/* 1580 */     List<vk> list1 = u(bup.bO);
/*      */     
/* 1582 */     this.a.accept(
/* 1583 */         in.a(bup.bO)
/* 1584 */         .a(a(☃, ☃ -> ☃))
/* 1585 */         .a(a(list1, ☃ -> ☃))
/* 1586 */         .a(a(list1, ☃ -> ☃.a(is.b, is.a.b)))
/* 1587 */         .a(a(list1, ☃ -> ☃.a(is.b, is.a.c)))
/* 1588 */         .a(a(list1, ☃ -> ☃.a(is.b, is.a.d))));
/*      */   }
/*      */ 
/*      */   
/*      */   private void w(buo ☃) {
/* 1593 */     vk vk1 = jb.o.a(☃, this.b);
/* 1594 */     vk vk2 = jb.p.a(☃, this.b);
/*      */     
/* 1596 */     a(☃.h());
/* 1597 */     this.a.accept(
/* 1598 */         io.a(☃)
/* 1599 */         .a(a(cex.j, vk2, vk1)));
/*      */   }
/*      */ 
/*      */   
/*      */   private void F() {
/* 1604 */     this.a.accept(
/* 1605 */         io.a(bup.iI)
/* 1606 */         .a(
/* 1607 */           ip.<Integer>a(cex.ag)
/* 1608 */           .a(Integer.valueOf(0), ir.a().a(is.c, a(bup.iI, "_0", iy.c, iz::b)))
/* 1609 */           .a(Integer.valueOf(1), ir.a().a(is.c, a(bup.iI, "_1", iy.c, iz::b)))
/* 1610 */           .a(Integer.valueOf(2), ir.a().a(is.c, a(bup.iI, "_2", iy.c, iz::b)))
/* 1611 */           .a(Integer.valueOf(3), ir.a().a(is.c, a(bup.iI, "_3", iy.c, iz::b)))));
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   private void G() {
/* 1617 */     vk ☃ = iz.C(bup.j);
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 1622 */     iz iz = (new iz()).a(ja.e, ☃).b(ja.e, ja.c).a(ja.f, iz.a(bup.i, "_top")).a(ja.i, iz.a(bup.i, "_snow"));
/*      */     
/* 1624 */     ir ir = ir.a().a(is.c, iy.h.a(bup.i, "_snow", iz, this.b));
/*      */     
/* 1626 */     a(bup.i, iw.a(bup.i), ir);
/*      */     
/* 1628 */     vk vk1 = jb.e.get(bup.dT).a(iz1 -> iz1.a(ja.e, ☃)).a(bup.dT, this.b);
/* 1629 */     a(bup.dT, vk1, ir);
/*      */     
/* 1631 */     vk vk2 = jb.e.get(bup.l).a(iz1 -> iz1.a(ja.e, ☃)).a(bup.l, this.b);
/* 1632 */     a(bup.l, vk2, ir);
/*      */   }
/*      */   
/*      */   private void a(buo ☃, vk vk1, ir ir1) {
/* 1636 */     List<ir> list = Arrays.asList(a(vk1));
/* 1637 */     this.a.accept(
/* 1638 */         io.a(☃)
/* 1639 */         .a(
/* 1640 */           ip.<Boolean>a(cex.z)
/* 1641 */           .a(Boolean.valueOf(true), ir1)
/* 1642 */           .a(Boolean.valueOf(false), list)));
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   private void H() {
/* 1648 */     a(bmd.ms);
/* 1649 */     this.a.accept(
/* 1650 */         io.a(bup.eh)
/* 1651 */         .a(
/* 1652 */           ip.<Integer>a(cex.af)
/* 1653 */           .a(Integer.valueOf(0), ir.a().a(is.c, iw.a(bup.eh, "_stage0")))
/* 1654 */           .a(Integer.valueOf(1), ir.a().a(is.c, iw.a(bup.eh, "_stage1")))
/* 1655 */           .a(Integer.valueOf(2), ir.a().a(is.c, iw.a(bup.eh, "_stage2"))))
/*      */         
/* 1657 */         .a(c()));
/*      */   }
/*      */ 
/*      */   
/*      */   private void I() {
/* 1662 */     this.a.accept(d(bup.iE, iw.a(bup.iE)));
/*      */   }
/*      */   
/*      */   private void h(buo ☃, buo buo1) {
/* 1666 */     iz iz = iz.b(buo1);
/* 1667 */     vk vk1 = iy.D.a(☃, iz, this.b);
/* 1668 */     vk vk2 = iy.E.a(☃, iz, this.b);
/*      */     
/* 1670 */     this.a.accept(
/* 1671 */         io.a(☃)
/* 1672 */         .a(a(cex.az, Integer.valueOf(1), vk2, vk1)));
/*      */   }
/*      */ 
/*      */   
/*      */   private void J() {
/* 1677 */     vk ☃ = iw.a(bup.fy);
/* 1678 */     vk vk1 = iw.a(bup.fy, "_side");
/*      */     
/* 1680 */     a(bmd.fl);
/* 1681 */     this.a.accept(
/* 1682 */         io.a(bup.fy)
/* 1683 */         .a(
/* 1684 */           ip.<gc>a(cex.N)
/* 1685 */           .a(gc.a, ir.a().a(is.c, ☃))
/* 1686 */           .a(gc.c, ir.a().a(is.c, vk1))
/* 1687 */           .a(gc.f, ir.a().<vk>a(is.c, vk1).a(is.b, is.a.b))
/* 1688 */           .a(gc.d, ir.a().<vk>a(is.c, vk1).a(is.b, is.a.c))
/* 1689 */           .a(gc.e, ir.a().<vk>a(is.c, vk1).a(is.b, is.a.d))));
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private void i(buo ☃, buo buo1) {
/* 1696 */     vk vk = iw.a(☃);
/* 1697 */     this.a.accept(io.a(buo1, ir.a().a(is.c, vk)));
/* 1698 */     c(buo1, vk);
/*      */   }
/*      */   
/*      */   private void K() {
/* 1702 */     vk ☃ = iw.a(bup.dH, "_post_ends");
/* 1703 */     vk vk1 = iw.a(bup.dH, "_post");
/* 1704 */     vk vk2 = iw.a(bup.dH, "_cap");
/* 1705 */     vk vk3 = iw.a(bup.dH, "_cap_alt");
/* 1706 */     vk vk4 = iw.a(bup.dH, "_side");
/* 1707 */     vk vk5 = iw.a(bup.dH, "_side_alt");
/*      */     
/* 1709 */     this.a.accept(
/* 1710 */         in.a(bup.dH)
/* 1711 */         .a(ir.a().a(is.c, ☃))
/* 1712 */         .a(
/* 1713 */           im.a()
/* 1714 */           .<Boolean>a(cex.I, Boolean.valueOf(false))
/* 1715 */           .<Boolean>a(cex.J, Boolean.valueOf(false))
/* 1716 */           .<Boolean>a(cex.K, Boolean.valueOf(false))
/* 1717 */           .a(cex.L, Boolean.valueOf(false)), 
/* 1718 */           ir.a().a(is.c, vk1))
/*      */         
/* 1720 */         .a(
/* 1721 */           im.a()
/* 1722 */           .<Boolean>a(cex.I, Boolean.valueOf(true))
/* 1723 */           .<Boolean>a(cex.J, Boolean.valueOf(false))
/* 1724 */           .<Boolean>a(cex.K, Boolean.valueOf(false))
/* 1725 */           .a(cex.L, Boolean.valueOf(false)), 
/* 1726 */           ir.a().a(is.c, vk2))
/*      */         
/* 1728 */         .a(
/* 1729 */           im.a()
/* 1730 */           .<Boolean>a(cex.I, Boolean.valueOf(false))
/* 1731 */           .<Boolean>a(cex.J, Boolean.valueOf(true))
/* 1732 */           .<Boolean>a(cex.K, Boolean.valueOf(false))
/* 1733 */           .a(cex.L, Boolean.valueOf(false)), 
/* 1734 */           ir.a().<vk>a(is.c, vk2).a(is.b, is.a.b))
/*      */         
/* 1736 */         .a(
/* 1737 */           im.a()
/* 1738 */           .<Boolean>a(cex.I, Boolean.valueOf(false))
/* 1739 */           .<Boolean>a(cex.J, Boolean.valueOf(false))
/* 1740 */           .<Boolean>a(cex.K, Boolean.valueOf(true))
/* 1741 */           .a(cex.L, Boolean.valueOf(false)), 
/* 1742 */           ir.a().a(is.c, vk3))
/*      */         
/* 1744 */         .a(
/* 1745 */           im.a()
/* 1746 */           .<Boolean>a(cex.I, Boolean.valueOf(false))
/* 1747 */           .<Boolean>a(cex.J, Boolean.valueOf(false))
/* 1748 */           .<Boolean>a(cex.K, Boolean.valueOf(false))
/* 1749 */           .a(cex.L, Boolean.valueOf(true)), 
/* 1750 */           ir.a().<vk>a(is.c, vk3).a(is.b, is.a.b))
/*      */         
/* 1752 */         .a(im.a().a(cex.I, Boolean.valueOf(true)), ir.a().a(is.c, vk4))
/* 1753 */         .a(im.a().a(cex.J, Boolean.valueOf(true)), ir.a().<vk>a(is.c, vk4).a(is.b, is.a.b))
/* 1754 */         .a(im.a().a(cex.K, Boolean.valueOf(true)), ir.a().a(is.c, vk5))
/* 1755 */         .a(im.a().a(cex.L, Boolean.valueOf(true)), ir.a().<vk>a(is.c, vk5).a(is.b, is.a.b)));
/*      */     
/* 1757 */     b(bup.dH);
/*      */   }
/*      */   
/*      */   private void x(buo ☃) {
/* 1761 */     this.a.accept(
/* 1762 */         io.a(☃, ir.a().a(is.c, iw.a(☃)))
/* 1763 */         .a(b()));
/*      */   }
/*      */ 
/*      */   
/*      */   private void L() {
/* 1768 */     vk ☃ = iw.a(bup.cp);
/* 1769 */     vk vk1 = iw.a(bup.cp, "_on");
/*      */     
/* 1771 */     b(bup.cp);
/* 1772 */     this.a.accept(
/* 1773 */         io.a(bup.cp)
/* 1774 */         .a(
/* 1775 */           a(cex.w, ☃, vk1))
/*      */         
/* 1777 */         .a(
/* 1778 */           ip.<cet, gc>a(cex.Q, cex.O)
/* 1779 */           .a(cet.c, gc.c, ir.a().<is.a>a(is.a, is.a.c).a(is.b, is.a.c))
/* 1780 */           .a(cet.c, gc.f, ir.a().<is.a>a(is.a, is.a.c).a(is.b, is.a.d))
/* 1781 */           .a(cet.c, gc.d, ir.a().a(is.a, is.a.c))
/* 1782 */           .a(cet.c, gc.e, ir.a().<is.a>a(is.a, is.a.c).a(is.b, is.a.b))
/*      */           
/* 1784 */           .a(cet.a, gc.c, ir.a())
/* 1785 */           .a(cet.a, gc.f, ir.a().a(is.b, is.a.b))
/* 1786 */           .a(cet.a, gc.d, ir.a().a(is.b, is.a.c))
/* 1787 */           .a(cet.a, gc.e, ir.a().a(is.b, is.a.d))
/*      */           
/* 1789 */           .a(cet.b, gc.c, ir.a().a(is.a, is.a.b))
/* 1790 */           .a(cet.b, gc.f, ir.a().<is.a>a(is.a, is.a.b).a(is.b, is.a.b))
/* 1791 */           .a(cet.b, gc.d, ir.a().<is.a>a(is.a, is.a.b).a(is.b, is.a.c))
/* 1792 */           .a(cet.b, gc.e, ir.a().<is.a>a(is.a, is.a.b).a(is.b, is.a.d))));
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   private void M() {
/* 1798 */     b(bup.dU);
/* 1799 */     this.a.accept(d(bup.dU, iw.a(bup.dU)));
/*      */   }
/*      */   
/*      */   private void N() {
/* 1803 */     this.a.accept(
/* 1804 */         io.a(bup.cT)
/* 1805 */         .a(
/* 1806 */           ip.<gc.a>a(cex.E)
/* 1807 */           .a(gc.a.a, ir.a().a(is.c, iw.a(bup.cT, "_ns")))
/* 1808 */           .a(gc.a.c, ir.a().a(is.c, iw.a(bup.cT, "_ew")))));
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   private void O() {
/* 1814 */     vk ☃ = jb.a.a(bup.cL, this.b);
/* 1815 */     this.a.accept(
/* 1816 */         io.a(bup.cL, new ir[] { 
/* 1817 */             ir.a().a(is.c, ☃), 
/* 1818 */             ir.a().<vk>a(is.c, ☃).a(is.a, is.a.b), 
/* 1819 */             ir.a().<vk>a(is.c, ☃).a(is.a, is.a.c), 
/* 1820 */             ir.a().<vk>a(is.c, ☃).a(is.a, is.a.d), 
/*      */             
/* 1822 */             ir.a().<vk>a(is.c, ☃).a(is.b, is.a.b), 
/* 1823 */             ir.a().<vk>a(is.c, ☃).<is.a>a(is.b, is.a.b).a(is.a, is.a.b), 
/* 1824 */             ir.a().<vk>a(is.c, ☃).<is.a>a(is.b, is.a.b).a(is.a, is.a.c), 
/* 1825 */             ir.a().<vk>a(is.c, ☃).<is.a>a(is.b, is.a.b).a(is.a, is.a.d), 
/*      */             
/* 1827 */             ir.a().<vk>a(is.c, ☃).a(is.b, is.a.c), 
/* 1828 */             ir.a().<vk>a(is.c, ☃).<is.a>a(is.b, is.a.c).a(is.a, is.a.b), 
/* 1829 */             ir.a().<vk>a(is.c, ☃).<is.a>a(is.b, is.a.c).a(is.a, is.a.c), 
/* 1830 */             ir.a().<vk>a(is.c, ☃).<is.a>a(is.b, is.a.c).a(is.a, is.a.d), 
/*      */             
/* 1832 */             ir.a().<vk>a(is.c, ☃).a(is.b, is.a.d), 
/* 1833 */             ir.a().<vk>a(is.c, ☃).<is.a>a(is.b, is.a.d).a(is.a, is.a.b), 
/* 1834 */             ir.a().<vk>a(is.c, ☃).<is.a>a(is.b, is.a.d).a(is.a, is.a.c), 
/* 1835 */             ir.a().<vk>a(is.c, ☃).<is.a>a(is.b, is.a.d).a(is.a, is.a.d) }));
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private void P() {
/* 1842 */     vk ☃ = iw.a(bup.iO);
/* 1843 */     vk vk1 = iw.a(bup.iO, "_on");
/*      */     
/* 1845 */     this.a.accept(
/* 1846 */         io.a(bup.iO)
/* 1847 */         .a(a(cex.w, vk1, ☃))
/* 1848 */         .a(e()));
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private void Q() {
/* 1855 */     iz ☃ = (new iz()).a(ja.e, iz.a(bup.aW, "_bottom")).a(ja.i, iz.a(bup.aW, "_side"));
/*      */     
/* 1857 */     vk vk1 = iz.a(bup.aW, "_top_sticky");
/* 1858 */     vk vk2 = iz.a(bup.aW, "_top");
/*      */     
/* 1860 */     iz iz1 = ☃.c(ja.E, vk1);
/* 1861 */     iz iz2 = ☃.c(ja.E, vk2);
/*      */     
/* 1863 */     vk vk3 = iw.a(bup.aW, "_base");
/*      */     
/* 1865 */     a(bup.aW, vk3, iz2);
/* 1866 */     a(bup.aP, vk3, iz1);
/*      */     
/* 1868 */     vk vk4 = iy.h.a(bup.aW, "_inventory", ☃.c(ja.f, vk2), this.b);
/* 1869 */     vk vk5 = iy.h.a(bup.aP, "_inventory", ☃.c(ja.f, vk1), this.b);
/*      */     
/* 1871 */     c(bup.aW, vk4);
/* 1872 */     c(bup.aP, vk5);
/*      */   }
/*      */   
/*      */   private void a(buo ☃, vk vk1, iz iz1) {
/* 1876 */     vk vk2 = iy.aB.a(☃, iz1, this.b);
/* 1877 */     this.a.accept(
/* 1878 */         io.a(☃)
/* 1879 */         .a(a(cex.g, vk1, vk2))
/* 1880 */         .a(e()));
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private void R() {
/* 1887 */     iz ☃ = (new iz()).a(ja.F, iz.a(bup.aW, "_top")).a(ja.i, iz.a(bup.aW, "_side"));
/*      */     
/* 1889 */     iz iz1 = ☃.c(ja.E, iz.a(bup.aW, "_top_sticky"));
/* 1890 */     iz iz2 = ☃.c(ja.E, iz.a(bup.aW, "_top"));
/*      */     
/* 1892 */     this.a.accept(
/* 1893 */         io.a(bup.aX)
/* 1894 */         .a(
/* 1895 */           ip.<Boolean, cfi>a(cex.x, cex.aJ)
/* 1896 */           .a(Boolean.valueOf(false), cfi.a, ir.a().a(is.c, iy.aC.a(bup.aW, "_head", iz2, this.b)))
/* 1897 */           .a(Boolean.valueOf(false), cfi.b, ir.a().a(is.c, iy.aC.a(bup.aW, "_head_sticky", iz1, this.b)))
/* 1898 */           .a(Boolean.valueOf(true), cfi.a, ir.a().a(is.c, iy.aD.a(bup.aW, "_head_short", iz2, this.b)))
/* 1899 */           .a(Boolean.valueOf(true), cfi.b, ir.a().a(is.c, iy.aD.a(bup.aW, "_head_short_sticky", iz1, this.b))))
/*      */         
/* 1901 */         .a(
/* 1902 */           e()));
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   private void S() {
/* 1908 */     vk ☃ = iw.a(bup.lQ, "_stable");
/* 1909 */     vk vk1 = iw.a(bup.lQ, "_unstable");
/* 1910 */     c(bup.lQ, ☃);
/* 1911 */     this.a.accept(
/* 1912 */         io.a(bup.lQ)
/* 1913 */         .a(a(cex.b, vk1, ☃)));
/*      */   }
/*      */ 
/*      */   
/*      */   private void T() {
/* 1918 */     vk ☃ = jb.a.a(bup.eg, this.b);
/* 1919 */     vk vk1 = a(bup.eg, "_on", iy.c, iz::b);
/*      */     
/* 1921 */     this.a.accept(
/* 1922 */         io.a(bup.eg)
/* 1923 */         .a(a(cex.r, vk1, ☃)));
/*      */   }
/*      */ 
/*      */   
/*      */   private void j(buo ☃, buo buo1) {
/* 1928 */     iz iz = iz.u(☃);
/*      */     
/* 1930 */     this.a.accept(e(☃, iy.az.a(☃, iz, this.b)));
/*      */     
/* 1932 */     this.a.accept(
/* 1933 */         io.a(buo1, ir.a().a(is.c, iy.aA.a(buo1, iz, this.b)))
/* 1934 */         .a(d()));
/*      */     
/* 1936 */     b(☃);
/* 1937 */     a(buo1);
/*      */   }
/*      */   
/*      */   private void U() {
/* 1941 */     iz ☃ = iz.u(bup.cz);
/* 1942 */     iz iz1 = iz.i(iz.a(bup.cz, "_off"));
/*      */     
/* 1944 */     vk vk1 = iy.az.a(bup.cz, ☃, this.b);
/* 1945 */     vk vk2 = iy.az.a(bup.cz, "_off", iz1, this.b);
/*      */     
/* 1947 */     this.a.accept(
/* 1948 */         io.a(bup.cz)
/* 1949 */         .a(a(cex.r, vk1, vk2)));
/*      */ 
/*      */     
/* 1952 */     vk vk3 = iy.aA.a(bup.cA, ☃, this.b);
/* 1953 */     vk vk4 = iy.aA.a(bup.cA, "_off", iz1, this.b);
/*      */     
/* 1955 */     this.a.accept(
/* 1956 */         io.a(bup.cA)
/* 1957 */         .a(a(cex.r, vk3, vk4))
/* 1958 */         .a(d()));
/*      */     
/* 1960 */     b(bup.cz);
/* 1961 */     a(bup.cA);
/*      */   }
/*      */   
/*      */   private void V() {
/* 1965 */     a(bmd.jU);
/* 1966 */     this.a.accept(
/* 1967 */         io.a(bup.cX)
/* 1968 */         .a(
/* 1969 */           ip.<Comparable, Comparable, Comparable>a(cex.am, cex.s, cex.w)
/* 1970 */           .a((☃, bool1, bool2) -> {
/*      */               StringBuilder stringBuilder = new StringBuilder();
/*      */               
/*      */               stringBuilder.append('_').append(☃).append("tick");
/*      */               
/*      */               if (bool2.booleanValue()) {
/*      */                 stringBuilder.append("_on");
/*      */               }
/*      */               if (bool1.booleanValue()) {
/*      */                 stringBuilder.append("_locked");
/*      */               }
/*      */               return ir.a().a(is.c, iz.a(bup.cX, stringBuilder.toString()));
/* 1982 */             })).a(c()));
/*      */   }
/*      */ 
/*      */   
/*      */   private void W() {
/* 1987 */     a(bmd.aP);
/*      */     
/* 1989 */     this.a.accept(
/* 1990 */         io.a(bup.kU)
/* 1991 */         .a(
/* 1992 */           ip.<Integer, Boolean>a(cex.ay, cex.C)
/* 1993 */           .a(Integer.valueOf(1), Boolean.valueOf(false), Arrays.asList(a(iw.a("dead_sea_pickle"))))
/* 1994 */           .a(Integer.valueOf(2), Boolean.valueOf(false), Arrays.asList(a(iw.a("two_dead_sea_pickles"))))
/* 1995 */           .a(Integer.valueOf(3), Boolean.valueOf(false), Arrays.asList(a(iw.a("three_dead_sea_pickles"))))
/* 1996 */           .a(Integer.valueOf(4), Boolean.valueOf(false), Arrays.asList(a(iw.a("four_dead_sea_pickles"))))
/*      */           
/* 1998 */           .a(Integer.valueOf(1), Boolean.valueOf(true), Arrays.asList(a(iw.a("sea_pickle"))))
/* 1999 */           .a(Integer.valueOf(2), Boolean.valueOf(true), Arrays.asList(a(iw.a("two_sea_pickles"))))
/* 2000 */           .a(Integer.valueOf(3), Boolean.valueOf(true), Arrays.asList(a(iw.a("three_sea_pickles"))))
/* 2001 */           .a(Integer.valueOf(4), Boolean.valueOf(true), Arrays.asList(a(iw.a("four_sea_pickles"))))));
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private void X() {
/* 2008 */     iz ☃ = iz.a(bup.cC);
/* 2009 */     vk vk = iy.c.a(bup.cE, ☃, this.b);
/*      */     
/* 2011 */     this.a.accept(
/* 2012 */         io.a(bup.cC)
/* 2013 */         .a(
/* 2014 */           ip.<Comparable>a(cex.aq)
/* 2015 */           .a(integer -> ir.a().a(is.c, (integer.intValue() < 8) ? iw.a(bup.cC, "_height" + (integer.intValue() * 2)) : ☃))));
/*      */ 
/*      */ 
/*      */     
/* 2019 */     c(bup.cC, iw.a(bup.cC, "_height2"));
/* 2020 */     this.a.accept(e(bup.cE, vk));
/*      */   }
/*      */   
/*      */   private void Y() {
/* 2024 */     this.a.accept(
/* 2025 */         io.a(bup.ma, ir.a().a(is.c, iw.a(bup.ma)))
/* 2026 */         .a(b()));
/*      */   }
/*      */ 
/*      */   
/*      */   private void Z() {
/* 2031 */     vk ☃ = jb.a.a(bup.mY, this.b);
/* 2032 */     c(bup.mY, ☃);
/*      */     
/* 2034 */     this.a.accept(
/* 2035 */         io.a(bup.mY)
/* 2036 */         .a(
/* 2037 */           ip.<cfo>a(cex.aM)
/* 2038 */           .a(☃ -> ir.a().a(is.c, a(bup.mY, "_" + ☃.a(), iy.c, iz::b)))));
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private void aa() {
/* 2045 */     a(bmd.rm);
/* 2046 */     this.a.accept(
/* 2047 */         io.a(bup.mg)
/* 2048 */         .a(
/* 2049 */           ip.<Comparable>a(cex.ag)
/* 2050 */           .a(☃ -> ir.a().a(is.c, a(bup.mg, "_stage" + ☃, iy.S, iz::c)))));
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private void ab() {
/* 2058 */     a(bmd.kS);
/* 2059 */     this.a.accept(
/* 2060 */         io.a(bup.em)
/* 2061 */         .a(
/* 2062 */           ip.<Boolean, Boolean, Boolean, Boolean, Boolean>a(cex.a, cex.J, cex.I, cex.K, cex.L)
/*      */           
/* 2064 */           .a(Boolean.valueOf(false), Boolean.valueOf(false), Boolean.valueOf(false), Boolean.valueOf(false), Boolean.valueOf(false), ir.a().a(is.c, iw.a(bup.em, "_ns")))
/*      */ 
/*      */           
/* 2067 */           .a(Boolean.valueOf(false), Boolean.valueOf(true), Boolean.valueOf(false), Boolean.valueOf(false), Boolean.valueOf(false), ir.a().<vk>a(is.c, iw.a(bup.em, "_n")).a(is.b, is.a.b))
/* 2068 */           .a(Boolean.valueOf(false), Boolean.valueOf(false), Boolean.valueOf(true), Boolean.valueOf(false), Boolean.valueOf(false), ir.a().a(is.c, iw.a(bup.em, "_n")))
/* 2069 */           .a(Boolean.valueOf(false), Boolean.valueOf(false), Boolean.valueOf(false), Boolean.valueOf(true), Boolean.valueOf(false), ir.a().<vk>a(is.c, iw.a(bup.em, "_n")).a(is.b, is.a.c))
/* 2070 */           .a(Boolean.valueOf(false), Boolean.valueOf(false), Boolean.valueOf(false), Boolean.valueOf(false), Boolean.valueOf(true), ir.a().<vk>a(is.c, iw.a(bup.em, "_n")).a(is.b, is.a.d))
/*      */ 
/*      */           
/* 2073 */           .a(Boolean.valueOf(false), Boolean.valueOf(true), Boolean.valueOf(true), Boolean.valueOf(false), Boolean.valueOf(false), ir.a().a(is.c, iw.a(bup.em, "_ne")))
/* 2074 */           .a(Boolean.valueOf(false), Boolean.valueOf(true), Boolean.valueOf(false), Boolean.valueOf(true), Boolean.valueOf(false), ir.a().<vk>a(is.c, iw.a(bup.em, "_ne")).a(is.b, is.a.b))
/* 2075 */           .a(Boolean.valueOf(false), Boolean.valueOf(false), Boolean.valueOf(false), Boolean.valueOf(true), Boolean.valueOf(true), ir.a().<vk>a(is.c, iw.a(bup.em, "_ne")).a(is.b, is.a.c))
/* 2076 */           .a(Boolean.valueOf(false), Boolean.valueOf(false), Boolean.valueOf(true), Boolean.valueOf(false), Boolean.valueOf(true), ir.a().<vk>a(is.c, iw.a(bup.em, "_ne")).a(is.b, is.a.d))
/* 2077 */           .a(Boolean.valueOf(false), Boolean.valueOf(false), Boolean.valueOf(true), Boolean.valueOf(true), Boolean.valueOf(false), ir.a().a(is.c, iw.a(bup.em, "_ns")))
/* 2078 */           .a(Boolean.valueOf(false), Boolean.valueOf(true), Boolean.valueOf(false), Boolean.valueOf(false), Boolean.valueOf(true), ir.a().<vk>a(is.c, iw.a(bup.em, "_ns")).a(is.b, is.a.b))
/*      */ 
/*      */           
/* 2081 */           .a(Boolean.valueOf(false), Boolean.valueOf(true), Boolean.valueOf(true), Boolean.valueOf(true), Boolean.valueOf(false), ir.a().a(is.c, iw.a(bup.em, "_nse")))
/* 2082 */           .a(Boolean.valueOf(false), Boolean.valueOf(true), Boolean.valueOf(false), Boolean.valueOf(true), Boolean.valueOf(true), ir.a().<vk>a(is.c, iw.a(bup.em, "_nse")).a(is.b, is.a.b))
/* 2083 */           .a(Boolean.valueOf(false), Boolean.valueOf(false), Boolean.valueOf(true), Boolean.valueOf(true), Boolean.valueOf(true), ir.a().<vk>a(is.c, iw.a(bup.em, "_nse")).a(is.b, is.a.c))
/* 2084 */           .a(Boolean.valueOf(false), Boolean.valueOf(true), Boolean.valueOf(true), Boolean.valueOf(false), Boolean.valueOf(true), ir.a().<vk>a(is.c, iw.a(bup.em, "_nse")).a(is.b, is.a.d))
/*      */ 
/*      */           
/* 2087 */           .a(Boolean.valueOf(false), Boolean.valueOf(true), Boolean.valueOf(true), Boolean.valueOf(true), Boolean.valueOf(true), ir.a().a(is.c, iw.a(bup.em, "_nsew")))
/*      */ 
/*      */           
/* 2090 */           .a(Boolean.valueOf(true), Boolean.valueOf(false), Boolean.valueOf(false), Boolean.valueOf(false), Boolean.valueOf(false), ir.a().a(is.c, iw.a(bup.em, "_attached_ns")))
/*      */ 
/*      */           
/* 2093 */           .a(Boolean.valueOf(true), Boolean.valueOf(false), Boolean.valueOf(true), Boolean.valueOf(false), Boolean.valueOf(false), ir.a().a(is.c, iw.a(bup.em, "_attached_n")))
/* 2094 */           .a(Boolean.valueOf(true), Boolean.valueOf(false), Boolean.valueOf(false), Boolean.valueOf(true), Boolean.valueOf(false), ir.a().<vk>a(is.c, iw.a(bup.em, "_attached_n")).a(is.b, is.a.c))
/* 2095 */           .a(Boolean.valueOf(true), Boolean.valueOf(true), Boolean.valueOf(false), Boolean.valueOf(false), Boolean.valueOf(false), ir.a().<vk>a(is.c, iw.a(bup.em, "_attached_n")).a(is.b, is.a.b))
/* 2096 */           .a(Boolean.valueOf(true), Boolean.valueOf(false), Boolean.valueOf(false), Boolean.valueOf(false), Boolean.valueOf(true), ir.a().<vk>a(is.c, iw.a(bup.em, "_attached_n")).a(is.b, is.a.d))
/*      */ 
/*      */           
/* 2099 */           .a(Boolean.valueOf(true), Boolean.valueOf(true), Boolean.valueOf(true), Boolean.valueOf(false), Boolean.valueOf(false), ir.a().a(is.c, iw.a(bup.em, "_attached_ne")))
/* 2100 */           .a(Boolean.valueOf(true), Boolean.valueOf(true), Boolean.valueOf(false), Boolean.valueOf(true), Boolean.valueOf(false), ir.a().<vk>a(is.c, iw.a(bup.em, "_attached_ne")).a(is.b, is.a.b))
/* 2101 */           .a(Boolean.valueOf(true), Boolean.valueOf(false), Boolean.valueOf(false), Boolean.valueOf(true), Boolean.valueOf(true), ir.a().<vk>a(is.c, iw.a(bup.em, "_attached_ne")).a(is.b, is.a.c))
/* 2102 */           .a(Boolean.valueOf(true), Boolean.valueOf(false), Boolean.valueOf(true), Boolean.valueOf(false), Boolean.valueOf(true), ir.a().<vk>a(is.c, iw.a(bup.em, "_attached_ne")).a(is.b, is.a.d))
/* 2103 */           .a(Boolean.valueOf(true), Boolean.valueOf(false), Boolean.valueOf(true), Boolean.valueOf(true), Boolean.valueOf(false), ir.a().a(is.c, iw.a(bup.em, "_attached_ns")))
/* 2104 */           .a(Boolean.valueOf(true), Boolean.valueOf(true), Boolean.valueOf(false), Boolean.valueOf(false), Boolean.valueOf(true), ir.a().<vk>a(is.c, iw.a(bup.em, "_attached_ns")).a(is.b, is.a.b))
/*      */ 
/*      */           
/* 2107 */           .a(Boolean.valueOf(true), Boolean.valueOf(true), Boolean.valueOf(true), Boolean.valueOf(true), Boolean.valueOf(false), ir.a().a(is.c, iw.a(bup.em, "_attached_nse")))
/* 2108 */           .a(Boolean.valueOf(true), Boolean.valueOf(true), Boolean.valueOf(false), Boolean.valueOf(true), Boolean.valueOf(true), ir.a().<vk>a(is.c, iw.a(bup.em, "_attached_nse")).a(is.b, is.a.b))
/* 2109 */           .a(Boolean.valueOf(true), Boolean.valueOf(false), Boolean.valueOf(true), Boolean.valueOf(true), Boolean.valueOf(true), ir.a().<vk>a(is.c, iw.a(bup.em, "_attached_nse")).a(is.b, is.a.c))
/* 2110 */           .a(Boolean.valueOf(true), Boolean.valueOf(true), Boolean.valueOf(true), Boolean.valueOf(false), Boolean.valueOf(true), ir.a().<vk>a(is.c, iw.a(bup.em, "_attached_nse")).a(is.b, is.a.d))
/*      */ 
/*      */           
/* 2113 */           .a(Boolean.valueOf(true), Boolean.valueOf(true), Boolean.valueOf(true), Boolean.valueOf(true), Boolean.valueOf(true), ir.a().a(is.c, iw.a(bup.em, "_attached_nsew")))));
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   private void ac() {
/* 2119 */     b(bup.el);
/* 2120 */     this.a.accept(
/* 2121 */         io.a(bup.el)
/* 2122 */         .a(
/* 2123 */           ip.<Comparable, Comparable>a(cex.a, cex.w)
/* 2124 */           .a((☃, bool1) -> ir.a().a(is.c, iz.a(bup.el, (☃.booleanValue() ? "_attached" : "") + (bool1.booleanValue() ? "_on" : "")))))
/*      */         
/* 2126 */         .a(b()));
/*      */   }
/*      */ 
/*      */   
/*      */   private vk a(int ☃, String str, iz iz1) {
/* 2131 */     switch (☃) {
/*      */       case 1:
/* 2133 */         return iy.aF.a(iw.a(str + "turtle_egg"), iz1, this.b);
/*      */       case 2:
/* 2135 */         return iy.aG.a(iw.a("two_" + str + "turtle_eggs"), iz1, this.b);
/*      */       case 3:
/* 2137 */         return iy.aH.a(iw.a("three_" + str + "turtle_eggs"), iz1, this.b);
/*      */       case 4:
/* 2139 */         return iy.aI.a(iw.a("four_" + str + "turtle_eggs"), iz1, this.b);
/*      */     } 
/* 2141 */     throw new UnsupportedOperationException();
/*      */   }
/*      */ 
/*      */   
/*      */   private vk a(Integer ☃, Integer integer1) {
/* 2146 */     switch (integer1.intValue()) {
/*      */       case 0:
/* 2148 */         return a(☃.intValue(), "", iz.b(iz.C(bup.kf)));
/*      */       case 1:
/* 2150 */         return a(☃.intValue(), "slightly_cracked_", iz.b(iz.a(bup.kf, "_slightly_cracked")));
/*      */       case 2:
/* 2152 */         return a(☃.intValue(), "very_cracked_", iz.b(iz.a(bup.kf, "_very_cracked")));
/*      */     } 
/* 2154 */     throw new UnsupportedOperationException();
/*      */   }
/*      */ 
/*      */   
/*      */   private void ad() {
/* 2159 */     a(bmd.iC);
/* 2160 */     this.a.accept(
/* 2161 */         io.a(bup.kf)
/* 2162 */         .a(
/* 2163 */           ip.<Comparable, Comparable>a(cex.ao, cex.ap)
/* 2164 */           .b((☃, integer1) -> Arrays.asList(a(a(☃, integer1))))));
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   private void ae() {
/* 2170 */     b(bup.dP);
/* 2171 */     this.a.accept(
/* 2172 */         io.a(bup.dP)
/* 2173 */         .a(
/* 2174 */           ip.<Boolean, Boolean, Boolean, Boolean, Boolean>a(cex.J, cex.I, cex.K, cex.G, cex.L)
/* 2175 */           .a(Boolean.valueOf(false), Boolean.valueOf(false), Boolean.valueOf(false), Boolean.valueOf(false), Boolean.valueOf(false), ir.a().a(is.c, iw.a(bup.dP, "_1")))
/*      */           
/* 2177 */           .a(Boolean.valueOf(false), Boolean.valueOf(false), Boolean.valueOf(true), Boolean.valueOf(false), Boolean.valueOf(false), ir.a().a(is.c, iw.a(bup.dP, "_1")))
/* 2178 */           .a(Boolean.valueOf(false), Boolean.valueOf(false), Boolean.valueOf(false), Boolean.valueOf(false), Boolean.valueOf(true), ir.a().<vk>a(is.c, iw.a(bup.dP, "_1")).a(is.b, is.a.b))
/* 2179 */           .a(Boolean.valueOf(false), Boolean.valueOf(true), Boolean.valueOf(false), Boolean.valueOf(false), Boolean.valueOf(false), ir.a().<vk>a(is.c, iw.a(bup.dP, "_1")).a(is.b, is.a.c))
/* 2180 */           .a(Boolean.valueOf(true), Boolean.valueOf(false), Boolean.valueOf(false), Boolean.valueOf(false), Boolean.valueOf(false), ir.a().<vk>a(is.c, iw.a(bup.dP, "_1")).a(is.b, is.a.d))
/*      */           
/* 2182 */           .a(Boolean.valueOf(true), Boolean.valueOf(true), Boolean.valueOf(false), Boolean.valueOf(false), Boolean.valueOf(false), ir.a().a(is.c, iw.a(bup.dP, "_2")))
/* 2183 */           .a(Boolean.valueOf(true), Boolean.valueOf(false), Boolean.valueOf(true), Boolean.valueOf(false), Boolean.valueOf(false), ir.a().<vk>a(is.c, iw.a(bup.dP, "_2")).a(is.b, is.a.b))
/* 2184 */           .a(Boolean.valueOf(false), Boolean.valueOf(false), Boolean.valueOf(true), Boolean.valueOf(false), Boolean.valueOf(true), ir.a().<vk>a(is.c, iw.a(bup.dP, "_2")).a(is.b, is.a.c))
/* 2185 */           .a(Boolean.valueOf(false), Boolean.valueOf(true), Boolean.valueOf(false), Boolean.valueOf(false), Boolean.valueOf(true), ir.a().<vk>a(is.c, iw.a(bup.dP, "_2")).a(is.b, is.a.d))
/* 2186 */           .a(Boolean.valueOf(true), Boolean.valueOf(false), Boolean.valueOf(false), Boolean.valueOf(false), Boolean.valueOf(true), ir.a().a(is.c, iw.a(bup.dP, "_2_opposite")))
/* 2187 */           .a(Boolean.valueOf(false), Boolean.valueOf(true), Boolean.valueOf(true), Boolean.valueOf(false), Boolean.valueOf(false), ir.a().<vk>a(is.c, iw.a(bup.dP, "_2_opposite")).a(is.b, is.a.b))
/*      */           
/* 2189 */           .a(Boolean.valueOf(true), Boolean.valueOf(true), Boolean.valueOf(true), Boolean.valueOf(false), Boolean.valueOf(false), ir.a().a(is.c, iw.a(bup.dP, "_3")))
/* 2190 */           .a(Boolean.valueOf(true), Boolean.valueOf(false), Boolean.valueOf(true), Boolean.valueOf(false), Boolean.valueOf(true), ir.a().<vk>a(is.c, iw.a(bup.dP, "_3")).a(is.b, is.a.b))
/* 2191 */           .a(Boolean.valueOf(false), Boolean.valueOf(true), Boolean.valueOf(true), Boolean.valueOf(false), Boolean.valueOf(true), ir.a().<vk>a(is.c, iw.a(bup.dP, "_3")).a(is.b, is.a.c))
/* 2192 */           .a(Boolean.valueOf(true), Boolean.valueOf(true), Boolean.valueOf(false), Boolean.valueOf(false), Boolean.valueOf(true), ir.a().<vk>a(is.c, iw.a(bup.dP, "_3")).a(is.b, is.a.d))
/*      */           
/* 2194 */           .a(Boolean.valueOf(true), Boolean.valueOf(true), Boolean.valueOf(true), Boolean.valueOf(false), Boolean.valueOf(true), ir.a().a(is.c, iw.a(bup.dP, "_4")))
/*      */           
/* 2196 */           .a(Boolean.valueOf(false), Boolean.valueOf(false), Boolean.valueOf(false), Boolean.valueOf(true), Boolean.valueOf(false), ir.a().a(is.c, iw.a(bup.dP, "_u")))
/*      */           
/* 2198 */           .a(Boolean.valueOf(false), Boolean.valueOf(false), Boolean.valueOf(true), Boolean.valueOf(true), Boolean.valueOf(false), ir.a().a(is.c, iw.a(bup.dP, "_1u")))
/* 2199 */           .a(Boolean.valueOf(false), Boolean.valueOf(false), Boolean.valueOf(false), Boolean.valueOf(true), Boolean.valueOf(true), ir.a().<vk>a(is.c, iw.a(bup.dP, "_1u")).a(is.b, is.a.b))
/* 2200 */           .a(Boolean.valueOf(false), Boolean.valueOf(true), Boolean.valueOf(false), Boolean.valueOf(true), Boolean.valueOf(false), ir.a().<vk>a(is.c, iw.a(bup.dP, "_1u")).a(is.b, is.a.c))
/* 2201 */           .a(Boolean.valueOf(true), Boolean.valueOf(false), Boolean.valueOf(false), Boolean.valueOf(true), Boolean.valueOf(false), ir.a().<vk>a(is.c, iw.a(bup.dP, "_1u")).a(is.b, is.a.d))
/*      */           
/* 2203 */           .a(Boolean.valueOf(true), Boolean.valueOf(true), Boolean.valueOf(false), Boolean.valueOf(true), Boolean.valueOf(false), ir.a().a(is.c, iw.a(bup.dP, "_2u")))
/* 2204 */           .a(Boolean.valueOf(true), Boolean.valueOf(false), Boolean.valueOf(true), Boolean.valueOf(true), Boolean.valueOf(false), ir.a().<vk>a(is.c, iw.a(bup.dP, "_2u")).a(is.b, is.a.b))
/* 2205 */           .a(Boolean.valueOf(false), Boolean.valueOf(false), Boolean.valueOf(true), Boolean.valueOf(true), Boolean.valueOf(true), ir.a().<vk>a(is.c, iw.a(bup.dP, "_2u")).a(is.b, is.a.c))
/* 2206 */           .a(Boolean.valueOf(false), Boolean.valueOf(true), Boolean.valueOf(false), Boolean.valueOf(true), Boolean.valueOf(true), ir.a().<vk>a(is.c, iw.a(bup.dP, "_2u")).a(is.b, is.a.d))
/* 2207 */           .a(Boolean.valueOf(true), Boolean.valueOf(false), Boolean.valueOf(false), Boolean.valueOf(true), Boolean.valueOf(true), ir.a().a(is.c, iw.a(bup.dP, "_2u_opposite")))
/* 2208 */           .a(Boolean.valueOf(false), Boolean.valueOf(true), Boolean.valueOf(true), Boolean.valueOf(true), Boolean.valueOf(false), ir.a().<vk>a(is.c, iw.a(bup.dP, "_2u_opposite")).a(is.b, is.a.b))
/*      */           
/* 2210 */           .a(Boolean.valueOf(true), Boolean.valueOf(true), Boolean.valueOf(true), Boolean.valueOf(true), Boolean.valueOf(false), ir.a().a(is.c, iw.a(bup.dP, "_3u")))
/* 2211 */           .a(Boolean.valueOf(true), Boolean.valueOf(false), Boolean.valueOf(true), Boolean.valueOf(true), Boolean.valueOf(true), ir.a().<vk>a(is.c, iw.a(bup.dP, "_3u")).a(is.b, is.a.b))
/* 2212 */           .a(Boolean.valueOf(false), Boolean.valueOf(true), Boolean.valueOf(true), Boolean.valueOf(true), Boolean.valueOf(true), ir.a().<vk>a(is.c, iw.a(bup.dP, "_3u")).a(is.b, is.a.c))
/* 2213 */           .a(Boolean.valueOf(true), Boolean.valueOf(true), Boolean.valueOf(false), Boolean.valueOf(true), Boolean.valueOf(true), ir.a().<vk>a(is.c, iw.a(bup.dP, "_3u")).a(is.b, is.a.d))
/*      */           
/* 2215 */           .a(Boolean.valueOf(true), Boolean.valueOf(true), Boolean.valueOf(true), Boolean.valueOf(true), Boolean.valueOf(true), ir.a().a(is.c, iw.a(bup.dP, "_4u")))));
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   private void af() {
/* 2221 */     this.a.accept(e(bup.iJ, iy.c.a(bup.iJ, iz.b(iw.a("magma")), this.b)));
/*      */   }
/*      */   
/*      */   private void y(buo ☃) {
/* 2225 */     c(☃, jb.l);
/* 2226 */     iy.aN.a(iw.a(☃.h()), iz.q(☃), this.b);
/*      */   }
/*      */   
/*      */   private void b(buo ☃, buo buo1, c c1) {
/* 2230 */     b(☃, c1);
/* 2231 */     b(buo1, c1);
/*      */   }
/*      */   
/*      */   private void k(buo ☃, buo buo1) {
/* 2235 */     iy.aO.a(iw.a(☃.h()), iz.q(buo1), this.b);
/*      */   }
/*      */   
/*      */   private void ag() {
/* 2239 */     vk ☃ = iw.a(bup.b);
/* 2240 */     vk vk1 = iw.a(bup.b, "_mirrored");
/* 2241 */     this.a.accept(e(bup.dy, ☃, vk1));
/* 2242 */     c(bup.dy, ☃);
/*      */   }
/*      */   
/*      */   private void l(buo ☃, buo buo1) {
/* 2246 */     a(☃, c.b);
/* 2247 */     iz iz = iz.d(iz.a(☃, "_pot"));
/* 2248 */     vk vk = c.b.b().a(buo1, iz, this.b);
/* 2249 */     this.a.accept(e(buo1, vk));
/*      */   }
/*      */   
/*      */   private void ah() {
/* 2253 */     vk ☃ = iz.a(bup.nj, "_bottom");
/* 2254 */     vk vk1 = iz.a(bup.nj, "_top_off");
/* 2255 */     vk vk2 = iz.a(bup.nj, "_top");
/* 2256 */     vk[] arrayOfVk = new vk[5];
/* 2257 */     for (int i = 0; i < 5; i++) {
/*      */ 
/*      */ 
/*      */       
/* 2261 */       iz iz = (new iz()).a(ja.e, ☃).a(ja.f, (i == 0) ? vk1 : vk2).a(ja.i, iz.a(bup.nj, "_side" + i));
/* 2262 */       arrayOfVk[i] = iy.h.a(bup.nj, "_" + i, iz, this.b);
/*      */     } 
/*      */     
/* 2265 */     this.a.accept(
/* 2266 */         io.a(bup.nj)
/* 2267 */         .a(
/* 2268 */           ip.<Comparable>a(cex.aC)
/* 2269 */           .a(integer -> ir.a().a(is.c, ☃[integer.intValue()]))));
/*      */ 
/*      */     
/* 2272 */     a(bmd.rN, arrayOfVk[0]);
/*      */   }
/*      */   
/*      */   private ir a(ge ☃, ir ir1) {
/* 2276 */     switch (null.a[☃.ordinal()]) {
/*      */       case 1:
/* 2278 */         return ir1.a(is.a, is.a.b);
/*      */       case 2:
/* 2280 */         return ir1.<is.a>a(is.a, is.a.b).a(is.b, is.a.c);
/*      */       case 3:
/* 2282 */         return ir1.<is.a>a(is.a, is.a.b).a(is.b, is.a.d);
/*      */       case 4:
/* 2284 */         return ir1.<is.a>a(is.a, is.a.b).a(is.b, is.a.b);
/*      */       case 5:
/* 2286 */         return ir1.<is.a>a(is.a, is.a.d).a(is.b, is.a.c);
/*      */       case 6:
/* 2288 */         return ir1.a(is.a, is.a.d);
/*      */       case 7:
/* 2290 */         return ir1.<is.a>a(is.a, is.a.d).a(is.b, is.a.b);
/*      */       case 8:
/* 2292 */         return ir1.<is.a>a(is.a, is.a.d).a(is.b, is.a.d);
/*      */       
/*      */       case 9:
/* 2295 */         return ir1;
/*      */       case 10:
/* 2297 */         return ir1.a(is.b, is.a.c);
/*      */       case 11:
/* 2299 */         return ir1.a(is.b, is.a.d);
/*      */       case 12:
/* 2301 */         return ir1.a(is.b, is.a.b);
/*      */     } 
/* 2303 */     throw new UnsupportedOperationException("Rotation " + ☃ + " can't be expressed with existing x and y values");
/*      */   }
/*      */ 
/*      */   
/*      */   private void ai() {
/* 2308 */     vk ☃ = iz.a(bup.mZ, "_top");
/* 2309 */     vk vk1 = iz.a(bup.mZ, "_bottom");
/* 2310 */     vk vk2 = iz.a(bup.mZ, "_side");
/* 2311 */     vk vk3 = iz.a(bup.mZ, "_lock");
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 2322 */     iz iz = (new iz()).a(ja.o, vk2).a(ja.m, vk2).a(ja.l, vk2).a(ja.c, ☃).a(ja.j, ☃).a(ja.k, vk1).a(ja.n, vk3);
/*      */     
/* 2324 */     vk vk4 = iy.b.a(bup.mZ, iz, this.b);
/* 2325 */     this.a.accept(
/* 2326 */         io.a(bup.mZ, ir.a().a(is.c, vk4))
/* 2327 */         .a(
/* 2328 */           ip.<ge>a(cex.P)
/* 2329 */           .a(☃ -> a(☃, ir.a()))));
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public void a() {
/* 2335 */     k(bup.a);
/* 2336 */     a(bup.lb, bup.a);
/* 2337 */     a(bup.la, bup.a);
/* 2338 */     k(bup.es);
/* 2339 */     k(bup.cF);
/* 2340 */     a(bup.lc, bup.A);
/* 2341 */     k(bup.ef);
/* 2342 */     k(bup.ke);
/* 2343 */     k(bup.dZ);
/* 2344 */     k(bup.ev);
/* 2345 */     a(bmd.oX);
/* 2346 */     k(bup.ne);
/* 2347 */     k(bup.A);
/* 2348 */     k(bup.B);
/* 2349 */     k(bup.gn);
/* 2350 */     a(bmd.dO);
/*      */     
/* 2352 */     k(bup.kZ);
/* 2353 */     k(bup.eT);
/*      */     
/* 2355 */     a(bup.go, bmd.fJ);
/* 2356 */     a(bmd.fJ);
/* 2357 */     a(bup.iN, bmd.hn);
/* 2358 */     a(bmd.hn);
/* 2359 */     h(bup.bo, iz.a(bup.aW, "_side"));
/*      */     
/* 2361 */     c(bup.H, jb.a);
/* 2362 */     c(bup.gS, jb.a);
/* 2363 */     c(bup.bT, jb.a);
/* 2364 */     c(bup.bU, jb.a);
/* 2365 */     c(bup.ej, jb.a);
/* 2366 */     c(bup.en, jb.a);
/* 2367 */     c(bup.F, jb.a);
/* 2368 */     c(bup.I, jb.a);
/* 2369 */     c(bup.bE, jb.a);
/* 2370 */     c(bup.G, jb.a);
/* 2371 */     c(bup.bF, jb.a);
/* 2372 */     c(bup.nh, jb.c);
/* 2373 */     c(bup.ng, jb.a);
/* 2374 */     c(bup.aq, jb.a);
/* 2375 */     c(bup.ar, jb.a);
/* 2376 */     c(bup.fx, jb.a);
/* 2377 */     c(bup.cy, jb.a);
/* 2378 */     c(bup.fw, jb.a);
/* 2379 */     c(bup.nA, jb.a);
/*      */     
/* 2381 */     c(bup.kV, jb.a);
/* 2382 */     c(bup.nG, jb.a);
/* 2383 */     c(bup.cG, jb.a);
/* 2384 */     c(bup.k, jb.a);
/* 2385 */     c(bup.nH, jb.a);
/* 2386 */     c(bup.dw, jb.a);
/* 2387 */     c(bup.ni, jb.a);
/* 2388 */     c(bup.ee, jb.a);
/* 2389 */     c(bup.cS, jb.a);
/* 2390 */     c(bup.E, jb.a);
/* 2391 */     c(bup.nf, jb.a);
/* 2392 */     c(bup.cD, jb.a);
/* 2393 */     c(bup.cI, jb.f);
/* 2394 */     c(bup.no, jb.c);
/* 2395 */     c(bup.dK, jb.c);
/* 2396 */     c(bup.iK, jb.a);
/* 2397 */     c(bup.aw, jb.a);
/* 2398 */     c(bup.gT, jb.a);
/* 2399 */     c(bup.bK, jb.a);
/* 2400 */     c(bup.nI, jb.a);
/* 2401 */     c(bup.gz, jb.a);
/* 2402 */     c(bup.mw, jb.a);
/* 2403 */     c(bup.cM, jb.a);
/* 2404 */     c(bup.cN, jb.a);
/* 2405 */     c(bup.bP, jb.a);
/* 2406 */     c(bup.an, jb.a);
/* 2407 */     c(bup.aU, jb.q);
/* 2408 */     a(bmd.aO);
/* 2409 */     c(bup.bH, jb.e);
/* 2410 */     c(bup.nb, jb.c);
/* 2411 */     c(bup.mn, jb.a);
/* 2412 */     c(bup.ao, jb.a);
/* 2413 */     c(bup.nv, jb.a);
/* 2414 */     c(bup.fA, jb.c.a(☃ -> ☃.a(ja.i, iz.C(bup.fA))));
/* 2415 */     c(bup.dx, jb.a);
/* 2416 */     g(bup.au, bup.at);
/* 2417 */     g(bup.hH, bup.hG);
/* 2418 */     c(bup.nw, jb.a);
/*      */     
/* 2420 */     h(bup.fs, bup.bE);
/* 2421 */     h(bup.ft, bup.bF);
/*      */     
/* 2423 */     n();
/* 2424 */     r();
/* 2425 */     s();
/* 2426 */     a(new buo[] { bup.me, bup.mf });
/* 2427 */     t();
/* 2428 */     w();
/* 2429 */     x();
/* 2430 */     z();
/* 2431 */     A();
/* 2432 */     B();
/* 2433 */     y();
/* 2434 */     s(bup.iw);
/* 2435 */     C();
/* 2436 */     D();
/* 2437 */     E();
/* 2438 */     F();
/* 2439 */     G();
/* 2440 */     H();
/* 2441 */     I();
/* 2442 */     m();
/* 2443 */     J();
/* 2444 */     K();
/* 2445 */     L();
/* 2446 */     M();
/* 2447 */     N();
/* 2448 */     O();
/* 2449 */     P();
/* 2450 */     Q();
/* 2451 */     R();
/* 2452 */     S();
/* 2453 */     U();
/* 2454 */     T();
/* 2455 */     V();
/* 2456 */     W();
/* 2457 */     u();
/* 2458 */     X();
/* 2459 */     Y();
/* 2460 */     Z();
/* 2461 */     aa();
/* 2462 */     ab();
/* 2463 */     ac();
/* 2464 */     ad();
/* 2465 */     ae();
/* 2466 */     af();
/* 2467 */     ai();
/*      */     
/* 2469 */     x(bup.cg);
/* 2470 */     b(bup.cg);
/* 2471 */     x(bup.lY);
/*      */     
/* 2473 */     j(bup.bL, bup.bM);
/* 2474 */     j(bup.cQ, bup.cR);
/*      */     
/* 2476 */     a(bup.bV, bup.n, iz::c);
/* 2477 */     a(bup.lW, bup.p, iz::d);
/*      */     
/* 2479 */     r(bup.mu);
/* 2480 */     r(bup.ml);
/*      */     
/* 2482 */     q(bup.as);
/* 2483 */     q(bup.fE);
/*      */     
/* 2485 */     w(bup.mc);
/* 2486 */     w(bup.md);
/*      */     
/* 2488 */     g(bup.dI, iw.a(bup.dI));
/* 2489 */     a(bup.cO, jb.c);
/* 2490 */     a(bup.cP, jb.c);
/* 2491 */     a(bup.iM, jb.c);
/* 2492 */     d(bup.j);
/* 2493 */     d(bup.C);
/* 2494 */     d(bup.D);
/* 2495 */     c(bup.z);
/*      */     
/* 2497 */     a(bup.gA, jb.c, jb.d);
/* 2498 */     a(bup.iA, jb.r, jb.s);
/* 2499 */     a(bup.fB, jb.r, jb.s);
/*      */     
/* 2501 */     b(bup.lR, jb.h);
/*      */     
/* 2503 */     v();
/* 2504 */     a(bup.nc, iz::w);
/* 2505 */     a(bup.nd, iz::y);
/*      */ 
/*      */     
/* 2508 */     a(bup.iD, cex.ag, new int[] { 0, 1, 2, 3 });
/* 2509 */     a(bup.eU, cex.ai, new int[] { 0, 0, 1, 1, 2, 2, 2, 3 });
/* 2510 */     a(bup.dY, cex.ag, new int[] { 0, 1, 1, 2 });
/* 2511 */     a(bup.eV, cex.ai, new int[] { 0, 0, 1, 1, 2, 2, 2, 3 });
/* 2512 */     a(bup.bW, cex.ai, new int[] { 0, 1, 2, 3, 4, 5, 6, 7 });
/*      */     
/* 2514 */     a(iw.a("banner"), bup.n)
/* 2515 */       .a(iy.aP, new buo[] {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */           
/*      */           bup.ha, bup.hb, bup.hc, bup.hd, bup.he, bup.hf, bup.hg, bup.hh, bup.hi, bup.hj,
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */           
/*      */           bup.hk, bup.hl, bup.hm, bup.hn, bup.ho, bup.hp
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */         
/* 2533 */         }).b(new buo[] { 
/*      */           bup.hq, bup.hr, bup.hs, bup.ht, bup.hu, bup.hv, bup.hw, bup.hx, bup.hy, bup.hz, 
/*      */           bup.hA, bup.hB, bup.hC, bup.hD, bup.hE, bup.hF });
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 2552 */     a(iw.a("bed"), bup.n)
/* 2553 */       .b(new buo[] { 
/*      */           bup.ax, bup.ay, bup.az, bup.aA, bup.aB, bup.aC, bup.aD, bup.aE, bup.aF, bup.aG, 
/*      */           bup.aH, bup.aI, bup.aJ, bup.aK, bup.aL, bup.aM });
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 2572 */     k(bup.ax, bup.aY);
/* 2573 */     k(bup.ay, bup.aZ);
/* 2574 */     k(bup.az, bup.ba);
/* 2575 */     k(bup.aA, bup.bb);
/* 2576 */     k(bup.aB, bup.bc);
/* 2577 */     k(bup.aC, bup.bd);
/* 2578 */     k(bup.aD, bup.be);
/* 2579 */     k(bup.aE, bup.bf);
/* 2580 */     k(bup.aF, bup.bg);
/* 2581 */     k(bup.aG, bup.bh);
/* 2582 */     k(bup.aH, bup.bi);
/* 2583 */     k(bup.aI, bup.bj);
/* 2584 */     k(bup.aJ, bup.bk);
/* 2585 */     k(bup.aK, bup.bl);
/* 2586 */     k(bup.aL, bup.bm);
/* 2587 */     k(bup.aM, bup.bn);
/*      */     
/* 2589 */     a(iw.a("skull"), bup.cM)
/* 2590 */       .a(iy.aQ, new buo[] {
/*      */ 
/*      */           
/*      */           bup.fk, bup.fi, bup.fg, bup.fc, bup.fe
/*      */ 
/*      */ 
/*      */         
/* 2597 */         }).a(new buo[] {
/*      */           
/*      */           bup.fm
/* 2600 */         }).b(new buo[] { bup.fl, bup.fn, bup.fj, bup.fh, bup.fd, bup.ff });
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 2609 */     y(bup.iP);
/* 2610 */     y(bup.iQ);
/* 2611 */     y(bup.iR);
/* 2612 */     y(bup.iS);
/* 2613 */     y(bup.iT);
/* 2614 */     y(bup.iU);
/* 2615 */     y(bup.iV);
/* 2616 */     y(bup.iW);
/* 2617 */     y(bup.iX);
/* 2618 */     y(bup.iY);
/* 2619 */     y(bup.iZ);
/* 2620 */     y(bup.ja);
/* 2621 */     y(bup.jb);
/* 2622 */     y(bup.jc);
/* 2623 */     y(bup.jd);
/* 2624 */     y(bup.je);
/* 2625 */     y(bup.jf);
/*      */     
/* 2627 */     c(bup.kW, jb.l);
/* 2628 */     a(bup.kW);
/*      */     
/* 2630 */     a(iw.a("chest"), bup.n)
/* 2631 */       .b(new buo[] { bup.bR, bup.fr });
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 2636 */     a(iw.a("ender_chest"), bup.bK)
/* 2637 */       .b(new buo[] { bup.ek });
/*      */ 
/*      */ 
/*      */     
/* 2641 */     d(bup.ec, bup.bK)
/* 2642 */       .a(new buo[] { bup.ec, bup.iF });
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 2647 */     e(bup.jw);
/* 2648 */     e(bup.jx);
/* 2649 */     e(bup.jy);
/* 2650 */     e(bup.jz);
/* 2651 */     e(bup.jA);
/* 2652 */     e(bup.jB);
/* 2653 */     e(bup.jC);
/* 2654 */     e(bup.jD);
/* 2655 */     e(bup.jE);
/* 2656 */     e(bup.jF);
/* 2657 */     e(bup.jG);
/* 2658 */     e(bup.jH);
/* 2659 */     e(bup.jI);
/* 2660 */     e(bup.jJ);
/* 2661 */     e(bup.jK);
/* 2662 */     e(bup.jL);
/*      */     
/* 2664 */     a(jb.a, new buo[] { bup.jM, bup.jN, bup.jO, bup.jP, bup.jQ, bup.jR, bup.jS, bup.jT, bup.jU, bup.jV, bup.jW, bup.jX, bup.jY, bup.jZ, bup.ka, bup.kb });
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 2683 */     e(bup.gR);
/* 2684 */     e(bup.fF);
/* 2685 */     e(bup.fG);
/* 2686 */     e(bup.fH);
/* 2687 */     e(bup.fI);
/* 2688 */     e(bup.fJ);
/* 2689 */     e(bup.fK);
/* 2690 */     e(bup.fL);
/* 2691 */     e(bup.fM);
/* 2692 */     e(bup.fN);
/* 2693 */     e(bup.fO);
/* 2694 */     e(bup.fP);
/* 2695 */     e(bup.fQ);
/* 2696 */     e(bup.fR);
/* 2697 */     e(bup.fS);
/* 2698 */     e(bup.fT);
/* 2699 */     e(bup.fU);
/*      */     
/* 2701 */     f(bup.ap, bup.dJ);
/* 2702 */     f(bup.cY, bup.fV);
/* 2703 */     f(bup.cZ, bup.fW);
/* 2704 */     f(bup.da, bup.fX);
/* 2705 */     f(bup.db, bup.fY);
/* 2706 */     f(bup.dc, bup.fZ);
/* 2707 */     f(bup.dd, bup.ga);
/* 2708 */     f(bup.de, bup.gb);
/* 2709 */     f(bup.df, bup.gc);
/* 2710 */     f(bup.dg, bup.gd);
/* 2711 */     f(bup.dh, bup.ge);
/* 2712 */     f(bup.di, bup.gf);
/* 2713 */     f(bup.dj, bup.gg);
/* 2714 */     f(bup.dk, bup.gh);
/* 2715 */     f(bup.dl, bup.gi);
/* 2716 */     f(bup.dm, bup.gj);
/* 2717 */     f(bup.dn, bup.gk);
/*      */     
/* 2719 */     b(jb.j, new buo[] { bup.jg, bup.jh, bup.ji, bup.jj, bup.jk, bup.jl, bup.jm, bup.jn, bup.jo, bup.jp, bup.jq, bup.jr, bup.js, bup.jt, bup.ju, bup.jv });
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 2738 */     e(bup.aY, bup.gB);
/* 2739 */     e(bup.aZ, bup.gC);
/* 2740 */     e(bup.ba, bup.gD);
/* 2741 */     e(bup.bb, bup.gE);
/* 2742 */     e(bup.bc, bup.gF);
/* 2743 */     e(bup.bd, bup.gG);
/* 2744 */     e(bup.be, bup.gH);
/* 2745 */     e(bup.bf, bup.gI);
/* 2746 */     e(bup.bg, bup.gJ);
/* 2747 */     e(bup.bh, bup.gK);
/* 2748 */     e(bup.bi, bup.gL);
/* 2749 */     e(bup.bj, bup.gM);
/* 2750 */     e(bup.bk, bup.gN);
/* 2751 */     e(bup.bl, bup.gO);
/* 2752 */     e(bup.bm, bup.gP);
/* 2753 */     e(bup.bn, bup.gQ);
/*      */     
/* 2755 */     a(bup.aS, bup.eC, c.a);
/* 2756 */     a(bup.bp, bup.eD, c.b);
/* 2757 */     a(bup.bq, bup.eE, c.b);
/* 2758 */     a(bup.br, bup.eF, c.b);
/* 2759 */     a(bup.bs, bup.eG, c.b);
/* 2760 */     a(bup.bt, bup.eH, c.b);
/* 2761 */     a(bup.bu, bup.eI, c.b);
/* 2762 */     a(bup.bv, bup.eJ, c.b);
/* 2763 */     a(bup.bw, bup.eK, c.b);
/* 2764 */     a(bup.bx, bup.eL, c.b);
/* 2765 */     a(bup.by, bup.eM, c.b);
/* 2766 */     a(bup.bz, bup.eN, c.b);
/* 2767 */     a(bup.bB, bup.eO, c.b);
/* 2768 */     a(bup.bA, bup.eP, c.b);
/* 2769 */     a(bup.bD, bup.eQ, c.b);
/* 2770 */     a(bup.bC, bup.eR, c.b);
/* 2771 */     a(bup.aT, bup.eS, c.b);
/*      */     
/* 2773 */     p(bup.dE);
/* 2774 */     p(bup.dF);
/* 2775 */     p(bup.dG);
/*      */     
/* 2777 */     a(bup.aR, c.a);
/* 2778 */     b(bup.cH, c.a);
/* 2779 */     a(bmd.bD);
/* 2780 */     b(bup.kc, bup.kd, c.a);
/* 2781 */     a(bmd.bE);
/* 2782 */     a(bup.kd);
/* 2783 */     b(bup.mx, bup.my, c.b);
/* 2784 */     b(bup.mz, bup.mA, c.b);
/* 2785 */     a(bup.mx, "_plant");
/* 2786 */     a(bup.my);
/* 2787 */     a(bup.mz, "_plant");
/* 2788 */     a(bup.mA);
/* 2789 */     a(bup.kX, c.a, iz.c(iz.a(bup.kY, "_stage0")));
/* 2790 */     i();
/*      */     
/* 2792 */     a(bup.aQ, c.b);
/*      */     
/* 2794 */     c(bup.gV, c.b);
/* 2795 */     c(bup.gW, c.b);
/* 2796 */     c(bup.gX, c.b);
/* 2797 */     c(bup.gY, c.a);
/* 2798 */     c(bup.gZ, c.a);
/*      */     
/* 2800 */     g();
/* 2801 */     h();
/*      */     
/* 2803 */     a(bup.kv, bup.kq, bup.kl, bup.kg, bup.kF, bup.kA, bup.kP, bup.kK);
/* 2804 */     a(bup.kw, bup.kr, bup.km, bup.kh, bup.kG, bup.kB, bup.kQ, bup.kL);
/* 2805 */     a(bup.kx, bup.ks, bup.kn, bup.ki, bup.kH, bup.kC, bup.kR, bup.kM);
/* 2806 */     a(bup.ky, bup.kt, bup.ko, bup.kj, bup.kI, bup.kD, bup.kS, bup.kN);
/* 2807 */     a(bup.kz, bup.ku, bup.kp, bup.kk, bup.kJ, bup.kE, bup.kT, bup.kO);
/*      */     
/* 2809 */     c(bup.dO, bup.dM);
/* 2810 */     c(bup.dN, bup.dL);
/*      */     
/* 2812 */     f(bup.r)
/* 2813 */       .a(bup.fa)
/* 2814 */       .c(bup.ip)
/* 2815 */       .d(bup.ik)
/* 2816 */       .e(bup.cw)
/* 2817 */       .a(bup.cc, bup.cm)
/* 2818 */       .f(bup.hO)
/* 2819 */       .g(bup.gl);
/* 2820 */     g(bup.iu);
/* 2821 */     h(bup.ds);
/* 2822 */     j(bup.N).c(bup.N).a(bup.Z);
/* 2823 */     j(bup.S).c(bup.S).a(bup.af);
/* 2824 */     a(bup.x, bup.eA, c.b);
/* 2825 */     c(bup.al, jb.n);
/*      */     
/* 2827 */     f(bup.p)
/* 2828 */       .a(bup.eY)
/* 2829 */       .c(bup.in)
/* 2830 */       .d(bup.ii)
/* 2831 */       .e(bup.cu)
/* 2832 */       .a(bup.cb, bup.cl)
/* 2833 */       .f(bup.hM)
/* 2834 */       .g(bup.ep);
/* 2835 */     g(bup.is);
/* 2836 */     h(bup.dq);
/* 2837 */     j(bup.L).c(bup.L).a(bup.X);
/* 2838 */     j(bup.Q).c(bup.Q).a(bup.ad);
/* 2839 */     a(bup.v, bup.ey, c.b);
/* 2840 */     c(bup.aj, jb.n);
/*      */     
/* 2842 */     f(bup.n)
/* 2843 */       .a(bup.eW)
/* 2844 */       .c(bup.cJ)
/* 2845 */       .d(bup.dQ)
/* 2846 */       .e(bup.cs)
/* 2847 */       .a(bup.bZ, bup.cj)
/* 2848 */       .f(bup.hK)
/* 2849 */       .f(bup.hU)
/* 2850 */       .g(bup.bQ);
/* 2851 */     g(bup.cf);
/* 2852 */     i(bup.do);
/* 2853 */     j(bup.J).c(bup.J).a(bup.V);
/* 2854 */     j(bup.U).c(bup.U).a(bup.ab);
/* 2855 */     a(bup.t, bup.ew, c.b);
/* 2856 */     c(bup.ah, jb.n);
/*      */     
/* 2858 */     f(bup.o)
/* 2859 */       .a(bup.eX)
/* 2860 */       .c(bup.im)
/* 2861 */       .d(bup.ih)
/* 2862 */       .e(bup.ct)
/* 2863 */       .a(bup.ca, bup.ck)
/* 2864 */       .f(bup.hL)
/* 2865 */       .g(bup.eo);
/* 2866 */     g(bup.ir);
/* 2867 */     h(bup.dp);
/* 2868 */     j(bup.K).c(bup.K).a(bup.W);
/* 2869 */     j(bup.P).c(bup.P).a(bup.ac);
/* 2870 */     a(bup.u, bup.ex, c.b);
/* 2871 */     c(bup.ai, jb.n);
/*      */     
/* 2873 */     f(bup.s)
/* 2874 */       .a(bup.fb)
/* 2875 */       .c(bup.iq)
/* 2876 */       .d(bup.il)
/* 2877 */       .e(bup.cx)
/* 2878 */       .a(bup.ce, bup.co)
/* 2879 */       .f(bup.hP)
/* 2880 */       .g(bup.gm);
/* 2881 */     g(bup.iv);
/* 2882 */     i(bup.dt);
/* 2883 */     j(bup.O).c(bup.O).a(bup.aa);
/* 2884 */     j(bup.T).c(bup.T).a(bup.ag);
/* 2885 */     a(bup.y, bup.eB, c.b);
/* 2886 */     c(bup.am, jb.n);
/*      */     
/* 2888 */     f(bup.q)
/* 2889 */       .a(bup.eZ)
/* 2890 */       .c(bup.io)
/* 2891 */       .d(bup.ij)
/* 2892 */       .e(bup.cv)
/* 2893 */       .a(bup.cd, bup.cn)
/* 2894 */       .f(bup.hN)
/* 2895 */       .g(bup.eq);
/* 2896 */     g(bup.it);
/* 2897 */     h(bup.dr);
/* 2898 */     j(bup.M).c(bup.M).a(bup.Y);
/* 2899 */     j(bup.R).c(bup.R).a(bup.ae);
/* 2900 */     a(bup.w, bup.ez, c.b);
/* 2901 */     c(bup.ak, jb.n);
/*      */     
/* 2903 */     f(bup.mC)
/* 2904 */       .a(bup.mQ)
/* 2905 */       .c(bup.mI)
/* 2906 */       .d(bup.mM)
/* 2907 */       .e(bup.mG)
/* 2908 */       .a(bup.mU, bup.mW)
/* 2909 */       .f(bup.mE)
/* 2910 */       .g(bup.mO);
/* 2911 */     g(bup.mS);
/* 2912 */     h(bup.mK);
/* 2913 */     j(bup.mq).b(bup.mq).a(bup.ms);
/* 2914 */     j(bup.mr).b(bup.mr).a(bup.mt);
/* 2915 */     a(bup.mv, bup.nk, c.b);
/* 2916 */     l(bup.mB, bup.nm);
/*      */     
/* 2918 */     f(bup.mD)
/* 2919 */       .a(bup.mR)
/* 2920 */       .c(bup.mJ)
/* 2921 */       .d(bup.mN)
/* 2922 */       .e(bup.mH)
/* 2923 */       .a(bup.mV, bup.mX)
/* 2924 */       .f(bup.mF)
/* 2925 */       .g(bup.mP);
/* 2926 */     g(bup.mT);
/* 2927 */     h(bup.mL);
/* 2928 */     j(bup.mh).b(bup.mh).a(bup.mj);
/* 2929 */     j(bup.mi).b(bup.mi).a(bup.mk);
/* 2930 */     a(bup.mm, bup.nl, c.b);
/* 2931 */     l(bup.mo, bup.nn);
/*      */     
/* 2933 */     b(bup.mp, c.b);
/* 2934 */     a(bmd.bA);
/*      */     
/* 2936 */     a(iz.a(bup.b))
/* 2937 */       .a(☃ -> {
/*      */           vk vk1 = iy.c.a(bup.b, ☃, this.b);
/*      */           
/*      */           vk vk2 = iy.d.a(bup.b, ☃, this.b);
/*      */           this.a.accept(e(bup.b, vk1, vk2));
/*      */           return vk1;
/* 2943 */         }).f(bup.hQ)
/* 2944 */       .e(bup.cq)
/* 2945 */       .a(bup.cB)
/* 2946 */       .g(bup.lj);
/*      */     
/* 2948 */     g(bup.cr);
/* 2949 */     i(bup.gp);
/*      */     
/* 2951 */     f(bup.du)
/* 2952 */       .b(bup.lJ)
/* 2953 */       .g(bup.dS)
/* 2954 */       .f(bup.hX);
/*      */     
/* 2956 */     f(bup.dv)
/* 2957 */       .b(bup.lH)
/* 2958 */       .g(bup.lf)
/* 2959 */       .f(bup.lt);
/*      */     
/* 2961 */     f(bup.m)
/* 2962 */       .b(bup.et)
/* 2963 */       .g(bup.ci)
/* 2964 */       .f(bup.hV);
/*      */     
/* 2966 */     f(bup.bJ)
/* 2967 */       .b(bup.eu)
/* 2968 */       .g(bup.lh)
/* 2969 */       .f(bup.lv);
/*      */     
/* 2971 */     f(bup.gq)
/* 2972 */       .b(bup.lF)
/* 2973 */       .g(bup.gt)
/* 2974 */       .f(bup.gw);
/*      */     
/* 2976 */     f(bup.gr)
/* 2977 */       .g(bup.gu)
/* 2978 */       .f(bup.gx);
/*      */     
/* 2980 */     f(bup.gs)
/* 2981 */       .g(bup.gv)
/* 2982 */       .f(bup.gy);
/*      */     
/* 2984 */     d(bup.at, jb.t)
/* 2985 */       .b(bup.lN)
/* 2986 */       .g(bup.ei)
/* 2987 */       .f(bup.hS);
/*      */ 
/*      */     
/* 2990 */     a(bup.ie, jb.a(iz.a(bup.at, "_top")))
/* 2991 */       .f(bup.lx)
/* 2992 */       .g(bup.lk);
/*      */     
/* 2994 */     a(bup.av, jb.c.get(bup.at).a(☃ -> ☃.a(ja.i, iz.C(bup.av))))
/* 2995 */       .f(bup.hT);
/*      */     
/* 2997 */     d(bup.hG, jb.t)
/* 2998 */       .b(bup.lG)
/* 2999 */       .g(bup.hJ)
/* 3000 */       .f(bup.ia);
/*      */     
/* 3002 */     a(bup.ig, jb.a(iz.a(bup.hG, "_top")))
/* 3003 */       .f(bup.ls)
/* 3004 */       .g(bup.le);
/*      */     
/* 3006 */     a(bup.hI, jb.c.get(bup.hG).a(☃ -> ☃.a(ja.i, iz.C(bup.hI))))
/* 3007 */       .f(bup.ib);
/*      */     
/* 3009 */     f(bup.bG)
/* 3010 */       .b(bup.lE)
/* 3011 */       .g(bup.dR)
/* 3012 */       .f(bup.hW);
/*      */     
/* 3014 */     f(bup.dV)
/* 3015 */       .c(bup.dW)
/* 3016 */       .b(bup.lK)
/* 3017 */       .g(bup.dX)
/* 3018 */       .f(bup.hY);
/*      */     
/* 3020 */     f(bup.iz)
/* 3021 */       .g(bup.iB)
/* 3022 */       .f(bup.ic);
/*      */     
/* 3024 */     f(bup.e)
/* 3025 */       .b(bup.lP)
/* 3026 */       .g(bup.lq)
/* 3027 */       .f(bup.lD);
/*      */     
/* 3029 */     f(bup.f)
/* 3030 */       .g(bup.lg)
/* 3031 */       .f(bup.lu);
/*      */     
/* 3033 */     f(bup.c)
/* 3034 */       .b(bup.lI)
/* 3035 */       .g(bup.lm)
/* 3036 */       .f(bup.lz);
/*      */     
/* 3038 */     f(bup.d)
/* 3039 */       .g(bup.ld)
/* 3040 */       .f(bup.lr);
/*      */     
/* 3042 */     f(bup.g)
/* 3043 */       .b(bup.lL)
/* 3044 */       .g(bup.ln)
/* 3045 */       .f(bup.lA);
/*      */     
/* 3047 */     f(bup.h)
/* 3048 */       .g(bup.lp)
/* 3049 */       .f(bup.lC);
/*      */     
/* 3051 */     f(bup.iC)
/* 3052 */       .b(bup.lO)
/* 3053 */       .g(bup.li)
/* 3054 */       .f(bup.lw);
/*      */     
/* 3056 */     d(bup.fz, jb.c)
/* 3057 */       .g(bup.fC)
/* 3058 */       .f(bup.hZ);
/*      */     
/* 3060 */     a(bup.if, jb.a(iz.a(bup.fz, "_bottom")))
/* 3061 */       .g(bup.ll)
/* 3062 */       .f(bup.ly);
/*      */     
/* 3064 */     f(bup.iL)
/* 3065 */       .f(bup.lB)
/* 3066 */       .g(bup.lo)
/* 3067 */       .b(bup.lM);
/*      */     
/* 3069 */     d(bup.np, jb.u)
/* 3070 */       .b(bup.nr)
/* 3071 */       .g(bup.nq)
/* 3072 */       .f(bup.ns);
/*      */     
/* 3074 */     f(bup.nu)
/* 3075 */       .b(bup.nz)
/* 3076 */       .g(bup.ny)
/* 3077 */       .f(bup.nx);
/*      */     
/* 3079 */     f(bup.nt)
/* 3080 */       .b(bup.nF)
/* 3081 */       .e(bup.nD)
/* 3082 */       .a(bup.nE)
/* 3083 */       .g(bup.nB)
/* 3084 */       .f(bup.nC);
/*      */     
/* 3086 */     q();
/*      */     
/* 3088 */     l(bup.ch);
/* 3089 */     m(bup.aN);
/* 3090 */     m(bup.aO);
/* 3091 */     m(bup.fD);
/*      */     
/* 3093 */     p();
/*      */     
/* 3095 */     n(bup.er);
/* 3096 */     n(bup.iG);
/* 3097 */     n(bup.iH);
/*      */     
/* 3099 */     o(bup.fo);
/* 3100 */     o(bup.fp);
/* 3101 */     o(bup.fq);
/*      */     
/* 3103 */     k();
/* 3104 */     l();
/*      */     
/* 3106 */     e(bup.bY, jb.g);
/* 3107 */     e(bup.lU, jb.g);
/* 3108 */     e(bup.lT, jb.h);
/*      */     
/* 3110 */     o();
/*      */     
/* 3112 */     ah();
/*      */     
/* 3114 */     i(bup.dx, bup.dD);
/* 3115 */     i(bup.m, bup.dz);
/* 3116 */     i(bup.dw, bup.dC);
/* 3117 */     i(bup.dv, bup.dB);
/* 3118 */     ag();
/* 3119 */     i(bup.du, bup.dA);
/*      */     
/* 3121 */     bna.f().forEach(☃ -> a(☃, iw.b("template_spawn_egg")));
/*      */   }
/*      */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\ii.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */