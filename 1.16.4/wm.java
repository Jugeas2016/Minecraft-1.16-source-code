/*     */ import com.google.common.collect.Lists;
/*     */ import com.mojang.brigadier.CommandDispatcher;
/*     */ import com.mojang.brigadier.Message;
/*     */ import com.mojang.brigadier.builder.LiteralArgumentBuilder;
/*     */ import com.mojang.brigadier.builder.RequiredArgumentBuilder;
/*     */ import com.mojang.brigadier.context.CommandContext;
/*     */ import com.mojang.brigadier.exceptions.CommandSyntaxException;
/*     */ import com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType;
/*     */ import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
/*     */ import java.util.Deque;
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
/*     */ 
/*     */ 
/*     */ public class wm
/*     */ {
/*     */   private static final Dynamic2CommandExceptionType c;
/*  38 */   private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(new of("commands.clone.overlap")); static {
/*  39 */     c = new Dynamic2CommandExceptionType((☃, object1) -> new of("commands.clone.toobig", new Object[] { ☃, object1 }));
/*  40 */   } private static final SimpleCommandExceptionType d = new SimpleCommandExceptionType(new of("commands.clone.failed")); static {
/*  41 */     a = (☃ -> !☃.a().g());
/*     */   } public static final Predicate<cel> a;
/*     */   public static void a(CommandDispatcher<db> ☃) {
/*  44 */     ☃.register(
/*  45 */         (LiteralArgumentBuilder)((LiteralArgumentBuilder)dc.a("clone")
/*  46 */         .requires(☃ -> ☃.c(2)))
/*  47 */         .then(
/*  48 */           dc.<T>a("begin", ek.a())
/*  49 */           .then(
/*  50 */             dc.<T>a("end", ek.a())
/*  51 */             .then((
/*  52 */               (RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)dc.<T>a("destination", ek.a())
/*  53 */               .executes(☃ -> a((db)☃.getSource(), ek.a(☃, "begin"), ek.a(☃, "end"), ek.a(☃, "destination"), (), b.c)))
/*  54 */               .then((
/*  55 */                 (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)dc.a("replace")
/*  56 */                 .executes(☃ -> a((db)☃.getSource(), ek.a(☃, "begin"), ek.a(☃, "end"), ek.a(☃, "destination"), (), b.c)))
/*  57 */                 .then(
/*  58 */                   dc.a("force")
/*  59 */                   .executes(☃ -> a((db)☃.getSource(), ek.a(☃, "begin"), ek.a(☃, "end"), ek.a(☃, "destination"), (), b.a))))
/*     */                 
/*  61 */                 .then(
/*  62 */                   dc.a("move")
/*  63 */                   .executes(☃ -> a((db)☃.getSource(), ek.a(☃, "begin"), ek.a(☃, "end"), ek.a(☃, "destination"), (), b.b))))
/*     */                 
/*  65 */                 .then(
/*  66 */                   dc.a("normal")
/*  67 */                   .executes(☃ -> a((db)☃.getSource(), ek.a(☃, "begin"), ek.a(☃, "end"), ek.a(☃, "destination"), (), b.c)))))
/*     */ 
/*     */               
/*  70 */               .then((
/*  71 */                 (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)dc.a("masked")
/*  72 */                 .executes(☃ -> a((db)☃.getSource(), ek.a(☃, "begin"), ek.a(☃, "end"), ek.a(☃, "destination"), a, b.c)))
/*  73 */                 .then(
/*  74 */                   dc.a("force")
/*  75 */                   .executes(☃ -> a((db)☃.getSource(), ek.a(☃, "begin"), ek.a(☃, "end"), ek.a(☃, "destination"), a, b.a))))
/*     */                 
/*  77 */                 .then(
/*  78 */                   dc.a("move")
/*  79 */                   .executes(☃ -> a((db)☃.getSource(), ek.a(☃, "begin"), ek.a(☃, "end"), ek.a(☃, "destination"), a, b.b))))
/*     */                 
/*  81 */                 .then(
/*  82 */                   dc.a("normal")
/*  83 */                   .executes(☃ -> a((db)☃.getSource(), ek.a(☃, "begin"), ek.a(☃, "end"), ek.a(☃, "destination"), a, b.c)))))
/*     */ 
/*     */               
/*  86 */               .then(
/*  87 */                 dc.a("filtered")
/*  88 */                 .then((
/*  89 */                   (RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)dc.<T>a("filter", eg.a())
/*  90 */                   .executes(☃ -> a((db)☃.getSource(), ek.a(☃, "begin"), ek.a(☃, "end"), ek.a(☃, "destination"), eg.a(☃, "filter"), b.c)))
/*  91 */                   .then(
/*  92 */                     dc.a("force")
/*  93 */                     .executes(☃ -> a((db)☃.getSource(), ek.a(☃, "begin"), ek.a(☃, "end"), ek.a(☃, "destination"), eg.a(☃, "filter"), b.a))))
/*     */                   
/*  95 */                   .then(
/*  96 */                     dc.a("move")
/*  97 */                     .executes(☃ -> a((db)☃.getSource(), ek.a(☃, "begin"), ek.a(☃, "end"), ek.a(☃, "destination"), eg.a(☃, "filter"), b.b))))
/*     */                   
/*  99 */                   .then(
/* 100 */                     dc.a("normal")
/* 101 */                     .executes(☃ -> a((db)☃.getSource(), ek.a(☃, "begin"), ek.a(☃, "end"), ek.a(☃, "destination"), eg.a(☃, "filter"), b.c)))))))));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private static int a(db ☃, fx fx1, fx fx2, fx fx3, Predicate<cel> predicate, b b1) throws CommandSyntaxException {
/* 112 */     cra cra1 = new cra(fx1, fx2);
/* 113 */     fx fx4 = fx3.a(cra1.c());
/* 114 */     cra cra2 = new cra(fx3, fx4);
/* 115 */     if (!b1.a() && cra2.b(cra1)) {
/* 116 */       throw b.create();
/*     */     }
/* 118 */     int i = cra1.d() * cra1.e() * cra1.f();
/* 119 */     if (i > 32768) {
/* 120 */       throw c.create(Integer.valueOf(32768), Integer.valueOf(i));
/*     */     }
/* 122 */     aag aag = ☃.e();
/* 123 */     if (!aag.a(fx1, fx2) || !aag.a(fx3, fx4)) {
/* 124 */       throw ek.a.create();
/*     */     }
/*     */     
/* 127 */     List<a> list1 = Lists.newArrayList();
/* 128 */     List<a> list2 = Lists.newArrayList();
/* 129 */     List<a> list3 = Lists.newArrayList();
/* 130 */     Deque<fx> deque = Lists.newLinkedList();
/*     */     
/* 132 */     fx fx5 = new fx(cra2.a - cra1.a, cra2.b - cra1.b, cra2.c - cra1.c);
/* 133 */     for (int j = cra1.c; j <= cra1.f; j++) {
/* 134 */       for (int m = cra1.b; m <= cra1.e; m++) {
/* 135 */         for (int n = cra1.a; n <= cra1.d; n++) {
/* 136 */           fx fx6 = new fx(n, m, j);
/* 137 */           fx fx7 = fx6.a(fx5);
/* 138 */           cel cel = new cel(aag, fx6, false);
/* 139 */           ceh ceh = cel.a();
/* 140 */           if (predicate.test(cel)) {
/*     */ 
/*     */ 
/*     */             
/* 144 */             ccj ccj = aag.c(fx6);
/* 145 */             if (ccj != null) {
/* 146 */               md md = ccj.a(new md());
/* 147 */               list2.add(new a(fx7, ceh, md));
/* 148 */               deque.addLast(fx6);
/* 149 */             } else if (ceh.i(aag, fx6) || ceh.r(aag, fx6)) {
/* 150 */               list1.add(new a(fx7, ceh, null));
/* 151 */               deque.addLast(fx6);
/*     */             } else {
/* 153 */               list3.add(new a(fx7, ceh, null));
/* 154 */               deque.addFirst(fx6);
/*     */             } 
/*     */           } 
/*     */         } 
/*     */       } 
/*     */     } 
/* 160 */     if (b1 == b.b) {
/* 161 */       for (fx fx6 : deque) {
/* 162 */         ccj ccj = aag.c(fx6);
/* 163 */         aol.a(ccj);
/* 164 */         aag.a(fx6, bup.go.n(), 2);
/*     */       } 
/* 166 */       for (fx fx6 : deque) {
/* 167 */         aag.a(fx6, bup.a.n(), 3);
/*     */       }
/*     */     } 
/*     */     
/* 171 */     List<a> list4 = Lists.newArrayList();
/* 172 */     list4.addAll(list1);
/* 173 */     list4.addAll(list2);
/* 174 */     list4.addAll(list3);
/*     */     
/* 176 */     List<a> list5 = Lists.reverse(list4);
/* 177 */     for (a a : list5) {
/* 178 */       ccj ccj = aag.c(a.a);
/* 179 */       aol.a(ccj);
/* 180 */       aag.a(a.a, bup.go.n(), 2);
/*     */     } 
/*     */     
/* 183 */     int k = 0;
/* 184 */     for (a a : list4) {
/* 185 */       if (aag.a(a.a, a.b, 2)) {
/* 186 */         k++;
/*     */       }
/*     */     } 
/* 189 */     for (a a : list2) {
/* 190 */       ccj ccj = aag.c(a.a);
/* 191 */       if (a.c != null && ccj != null) {
/* 192 */         a.c.b("x", a.a.u());
/* 193 */         a.c.b("y", a.a.v());
/* 194 */         a.c.b("z", a.a.w());
/* 195 */         ccj.a(a.b, a.c);
/* 196 */         ccj.X_();
/*     */       } 
/* 198 */       aag.a(a.a, a.b, 2);
/*     */     } 
/*     */     
/* 201 */     for (a a : list5) {
/* 202 */       aag.a(a.a, a.b.b());
/*     */     }
/*     */     
/* 205 */     aag.j().a(cra1, fx5);
/*     */     
/* 207 */     if (k == 0) {
/* 208 */       throw d.create();
/*     */     }
/*     */     
/* 211 */     ☃.a(new of("commands.clone.success", new Object[] { Integer.valueOf(k) }), true);
/*     */     
/* 213 */     return k;
/*     */   }
/*     */   
/*     */   enum b {
/* 217 */     a(true),
/* 218 */     b(true),
/* 219 */     c(false);
/*     */     
/*     */     private final boolean d;
/*     */ 
/*     */     
/*     */     b(boolean ☃) {
/* 225 */       this.d = ☃;
/*     */     }
/*     */     
/*     */     public boolean a() {
/* 229 */       return this.d;
/*     */     }
/*     */   }
/*     */   
/*     */   static class a {
/*     */     public final fx a;
/*     */     public final ceh b;
/*     */     @Nullable
/*     */     public final md c;
/*     */     
/*     */     public a(fx ☃, ceh ceh1, @Nullable md md1) {
/* 240 */       this.a = ☃;
/* 241 */       this.b = ceh1;
/* 242 */       this.c = md1;
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\wm.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */