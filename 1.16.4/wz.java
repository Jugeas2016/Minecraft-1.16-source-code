/*     */ import com.google.common.collect.Lists;
/*     */ import com.mojang.brigadier.CommandDispatcher;
/*     */ import com.mojang.brigadier.Message;
/*     */ import com.mojang.brigadier.builder.LiteralArgumentBuilder;
/*     */ import com.mojang.brigadier.builder.RequiredArgumentBuilder;
/*     */ import com.mojang.brigadier.context.CommandContext;
/*     */ import com.mojang.brigadier.exceptions.CommandSyntaxException;
/*     */ import com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType;
/*     */ import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
/*     */ import java.util.Collections;
/*     */ import java.util.List;
/*     */ import java.util.function.Predicate;
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
/*     */ public class wz
/*     */ {
/*     */   private static final Dynamic2CommandExceptionType a;
/*     */   
/*     */   static {
/*  38 */     a = new Dynamic2CommandExceptionType((☃, object1) -> new of("commands.fill.toobig", new Object[] { ☃, object1 }));
/*  39 */   } private static final ef b = new ef(bup.a.n(), Collections.emptySet(), null);
/*  40 */   private static final SimpleCommandExceptionType c = new SimpleCommandExceptionType(new of("commands.fill.failed"));
/*     */   
/*     */   public static void a(CommandDispatcher<db> ☃) {
/*  43 */     ☃.register(
/*  44 */         (LiteralArgumentBuilder)((LiteralArgumentBuilder)dc.a("fill")
/*  45 */         .requires(☃ -> ☃.c(2)))
/*  46 */         .then(
/*  47 */           dc.<T>a("from", ek.a())
/*  48 */           .then(
/*  49 */             dc.<T>a("to", ek.a())
/*  50 */             .then((
/*  51 */               (RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)dc.<T>a("block", eh.a())
/*  52 */               .executes(☃ -> a((db)☃.getSource(), new cra(ek.a(☃, "from"), ek.a(☃, "to")), eh.a(☃, "block"), a.a, null)))
/*  53 */               .then((
/*  54 */                 (LiteralArgumentBuilder)dc.a("replace")
/*  55 */                 .executes(☃ -> a((db)☃.getSource(), new cra(ek.a(☃, "from"), ek.a(☃, "to")), eh.a(☃, "block"), a.a, null)))
/*  56 */                 .then(
/*  57 */                   dc.<T>a("filter", eg.a())
/*  58 */                   .executes(☃ -> a((db)☃.getSource(), new cra(ek.a(☃, "from"), ek.a(☃, "to")), eh.a(☃, "block"), a.a, eg.a(☃, "filter"))))))
/*     */ 
/*     */               
/*  61 */               .then(
/*  62 */                 dc.a("keep")
/*  63 */                 .executes(☃ -> a((db)☃.getSource(), new cra(ek.a(☃, "from"), ek.a(☃, "to")), eh.a(☃, "block"), a.a, ()))))
/*     */               
/*  65 */               .then(
/*  66 */                 dc.a("outline")
/*  67 */                 .executes(☃ -> a((db)☃.getSource(), new cra(ek.a(☃, "from"), ek.a(☃, "to")), eh.a(☃, "block"), a.b, null))))
/*     */               
/*  69 */               .then(
/*  70 */                 dc.a("hollow")
/*  71 */                 .executes(☃ -> a((db)☃.getSource(), new cra(ek.a(☃, "from"), ek.a(☃, "to")), eh.a(☃, "block"), a.c, null))))
/*     */               
/*  73 */               .then(
/*  74 */                 dc.a("destroy")
/*  75 */                 .executes(☃ -> a((db)☃.getSource(), new cra(ek.a(☃, "from"), ek.a(☃, "to")), eh.a(☃, "block"), a.d, null)))))));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private static int a(db ☃, cra cra1, ef ef1, a a1, @Nullable Predicate<cel> predicate) throws CommandSyntaxException {
/*  84 */     int i = cra1.d() * cra1.e() * cra1.f();
/*  85 */     if (i > 32768) {
/*  86 */       throw a.create(Integer.valueOf(32768), Integer.valueOf(i));
/*     */     }
/*     */     
/*  89 */     List<fx> list = Lists.newArrayList();
/*  90 */     aag aag = ☃.e();
/*  91 */     int j = 0;
/*     */     
/*  93 */     for (fx fx : fx.b(cra1.a, cra1.b, cra1.c, cra1.d, cra1.e, cra1.f)) {
/*  94 */       if (predicate != null && !predicate.test(new cel(aag, fx, true))) {
/*     */         continue;
/*     */       }
/*  97 */       ef ef2 = a1.e.filter(cra1, fx, ef1, aag);
/*  98 */       if (ef2 == null) {
/*     */         continue;
/*     */       }
/*     */       
/* 102 */       ccj ccj = aag.c(fx);
/* 103 */       aol.a(ccj);
/*     */       
/* 105 */       if (!ef2.a(aag, fx, 2)) {
/*     */         continue;
/*     */       }
/*     */       
/* 109 */       list.add(fx.h());
/* 110 */       j++;
/*     */     } 
/*     */     
/* 113 */     for (fx fx : list) {
/* 114 */       buo buo = aag.d_(fx).b();
/* 115 */       aag.a(fx, buo);
/*     */     } 
/*     */     
/* 118 */     if (j == 0) {
/* 119 */       throw c.create();
/*     */     }
/*     */     
/* 122 */     ☃.a(new of("commands.fill.success", new Object[] { Integer.valueOf(j) }), true);
/*     */     
/* 124 */     return j;
/*     */   }
/*     */   enum a { a, b, c, d;
/*     */     static {
/* 128 */       a = new a("REPLACE", 0, (☃, fx1, ef1, aag1) -> ef1);
/* 129 */       b = new a("OUTLINE", 1, (☃, fx1, ef1, aag1) -> 
/* 130 */           (fx1.u() == ☃.a || fx1.u() == ☃.d || fx1.v() == ☃.b || fx1.v() == ☃.e || fx1.w() == ☃.c || fx1.w() == ☃.f) ? ef1 : null);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 136 */       c = new a("HOLLOW", 2, (☃, fx1, ef1, aag1) -> 
/* 137 */           (fx1.u() == ☃.a || fx1.u() == ☃.d || fx1.v() == ☃.b || fx1.v() == ☃.e || fx1.w() == ☃.c || fx1.w() == ☃.f) ? ef1 : wz.a());
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 143 */       d = new a("DESTROY", 3, (☃, fx1, ef1, aag1) -> {
/*     */             aag1.b(fx1, true);
/*     */             return ef1;
/*     */           });
/*     */     }
/*     */     public final ye.a e;
/*     */     
/*     */     a(ye.a ☃) {
/* 151 */       this.e = ☃;
/*     */     } }
/*     */ 
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\wz.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */