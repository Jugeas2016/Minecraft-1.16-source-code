/*     */ import com.google.common.collect.Lists;
/*     */ import com.mojang.brigadier.CommandDispatcher;
/*     */ import com.mojang.brigadier.arguments.ArgumentType;
/*     */ import com.mojang.brigadier.arguments.StringArgumentType;
/*     */ import com.mojang.brigadier.builder.LiteralArgumentBuilder;
/*     */ import com.mojang.brigadier.builder.RequiredArgumentBuilder;
/*     */ import com.mojang.brigadier.context.CommandContext;
/*     */ import com.mojang.brigadier.exceptions.CommandSyntaxException;
/*     */ import com.mojang.brigadier.suggestion.SuggestionProvider;
/*     */ import com.mojang.brigadier.suggestion.SuggestionsBuilder;
/*     */ import java.util.Collection;
/*     */ import java.util.List;
/*     */ import java.util.concurrent.CompletableFuture;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class wf
/*     */ {
/*     */   private static final SuggestionProvider<db> a;
/*     */   
/*     */   static {
/*  28 */     a = ((☃, suggestionsBuilder) -> {
/*     */         Collection<y> collection = ((db)☃.getSource()).j().aA().a();
/*     */         return dd.a(collection.stream().map(y::h), suggestionsBuilder);
/*     */       });
/*     */   }
/*     */   public static void a(CommandDispatcher<db> ☃) {
/*  34 */     ☃.register(
/*  35 */         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)dc.a("advancement")
/*  36 */         .requires(☃ -> ☃.c(2)))
/*  37 */         .then(
/*  38 */           dc.a("grant")
/*  39 */           .then((
/*  40 */             (RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)dc.<T>a("targets", dk.d())
/*  41 */             .then(
/*  42 */               dc.a("only")
/*  43 */               .then((
/*  44 */                 (RequiredArgumentBuilder)dc.<T>a("advancement", dy.a())
/*  45 */                 .suggests(a)
/*  46 */                 .executes(☃ -> a((db)☃.getSource(), dk.f(☃, "targets"), a.a, a(dy.a(☃, "advancement"), b.a))))
/*  47 */                 .then(
/*  48 */                   dc.<T>a("criterion", (ArgumentType<T>)StringArgumentType.greedyString())
/*  49 */                   .suggests((☃, suggestionsBuilder) -> dd.b(dy.a(☃, "advancement").f().keySet(), suggestionsBuilder))
/*  50 */                   .executes(☃ -> a((db)☃.getSource(), dk.f(☃, "targets"), a.a, dy.a(☃, "advancement"), StringArgumentType.getString(☃, "criterion")))))))
/*     */ 
/*     */ 
/*     */             
/*  54 */             .then(
/*  55 */               dc.a("from")
/*  56 */               .then(
/*  57 */                 dc.<T>a("advancement", dy.a())
/*  58 */                 .suggests(a)
/*  59 */                 .executes(☃ -> a((db)☃.getSource(), dk.f(☃, "targets"), a.a, a(dy.a(☃, "advancement"), b.c))))))
/*     */ 
/*     */             
/*  62 */             .then(
/*  63 */               dc.a("until")
/*  64 */               .then(
/*  65 */                 dc.<T>a("advancement", dy.a())
/*  66 */                 .suggests(a)
/*  67 */                 .executes(☃ -> a((db)☃.getSource(), dk.f(☃, "targets"), a.a, a(dy.a(☃, "advancement"), b.d))))))
/*     */ 
/*     */             
/*  70 */             .then(
/*  71 */               dc.a("through")
/*  72 */               .then(
/*  73 */                 dc.<T>a("advancement", dy.a())
/*  74 */                 .suggests(a)
/*  75 */                 .executes(☃ -> a((db)☃.getSource(), dk.f(☃, "targets"), a.a, a(dy.a(☃, "advancement"), b.b))))))
/*     */ 
/*     */             
/*  78 */             .then(
/*  79 */               dc.a("everything")
/*  80 */               .executes(☃ -> a((db)☃.getSource(), dk.f(☃, "targets"), a.a, ((db)☃.getSource()).j().aA().a()))))))
/*     */ 
/*     */ 
/*     */         
/*  84 */         .then(
/*  85 */           dc.a("revoke")
/*  86 */           .then((
/*  87 */             (RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)dc.<T>a("targets", dk.d())
/*  88 */             .then(
/*  89 */               dc.a("only")
/*  90 */               .then((
/*  91 */                 (RequiredArgumentBuilder)dc.<T>a("advancement", dy.a())
/*  92 */                 .suggests(a)
/*  93 */                 .executes(☃ -> a((db)☃.getSource(), dk.f(☃, "targets"), a.b, a(dy.a(☃, "advancement"), b.a))))
/*  94 */                 .then(
/*  95 */                   dc.<T>a("criterion", (ArgumentType<T>)StringArgumentType.greedyString())
/*  96 */                   .suggests((☃, suggestionsBuilder) -> dd.b(dy.a(☃, "advancement").f().keySet(), suggestionsBuilder))
/*  97 */                   .executes(☃ -> a((db)☃.getSource(), dk.f(☃, "targets"), a.b, dy.a(☃, "advancement"), StringArgumentType.getString(☃, "criterion")))))))
/*     */ 
/*     */ 
/*     */             
/* 101 */             .then(
/* 102 */               dc.a("from")
/* 103 */               .then(
/* 104 */                 dc.<T>a("advancement", dy.a())
/* 105 */                 .suggests(a)
/* 106 */                 .executes(☃ -> a((db)☃.getSource(), dk.f(☃, "targets"), a.b, a(dy.a(☃, "advancement"), b.c))))))
/*     */ 
/*     */             
/* 109 */             .then(
/* 110 */               dc.a("until")
/* 111 */               .then(
/* 112 */                 dc.<T>a("advancement", dy.a())
/* 113 */                 .suggests(a)
/* 114 */                 .executes(☃ -> a((db)☃.getSource(), dk.f(☃, "targets"), a.b, a(dy.a(☃, "advancement"), b.d))))))
/*     */ 
/*     */             
/* 117 */             .then(
/* 118 */               dc.a("through")
/* 119 */               .then(
/* 120 */                 dc.<T>a("advancement", dy.a())
/* 121 */                 .suggests(a)
/* 122 */                 .executes(☃ -> a((db)☃.getSource(), dk.f(☃, "targets"), a.b, a(dy.a(☃, "advancement"), b.b))))))
/*     */ 
/*     */             
/* 125 */             .then(
/* 126 */               dc.a("everything")
/* 127 */               .executes(☃ -> a((db)☃.getSource(), dk.f(☃, "targets"), a.b, ((db)☃.getSource()).j().aA().a()))))));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private static int a(db ☃, Collection<aah> collection, a a1, Collection<y> collection1) {
/* 135 */     int i = 0;
/* 136 */     for (aah aah : collection) {
/* 137 */       i += a1.a(aah, collection1);
/*     */     }
/*     */     
/* 140 */     if (i == 0) {
/* 141 */       if (collection1.size() == 1) {
/* 142 */         if (collection.size() == 1) {
/* 143 */           throw new cz(new of(a1.a() + ".one.to.one.failure", new Object[] { ((y)collection1.iterator().next()).j(), ((aah)collection.iterator().next()).d() }));
/*     */         }
/* 145 */         throw new cz(new of(a1.a() + ".one.to.many.failure", new Object[] { ((y)collection1.iterator().next()).j(), Integer.valueOf(collection.size()) }));
/*     */       } 
/*     */       
/* 148 */       if (collection.size() == 1) {
/* 149 */         throw new cz(new of(a1.a() + ".many.to.one.failure", new Object[] { Integer.valueOf(collection1.size()), ((aah)collection.iterator().next()).d() }));
/*     */       }
/* 151 */       throw new cz(new of(a1.a() + ".many.to.many.failure", new Object[] { Integer.valueOf(collection1.size()), Integer.valueOf(collection.size()) }));
/*     */     } 
/*     */ 
/*     */ 
/*     */     
/* 156 */     if (collection1.size() == 1) {
/* 157 */       if (collection.size() == 1) {
/* 158 */         ☃.a(new of(a1.a() + ".one.to.one.success", new Object[] { ((y)collection1.iterator().next()).j(), ((aah)collection.iterator().next()).d() }), true);
/*     */       } else {
/* 160 */         ☃.a(new of(a1.a() + ".one.to.many.success", new Object[] { ((y)collection1.iterator().next()).j(), Integer.valueOf(collection.size()) }), true);
/*     */       }
/*     */     
/* 163 */     } else if (collection.size() == 1) {
/* 164 */       ☃.a(new of(a1.a() + ".many.to.one.success", new Object[] { Integer.valueOf(collection1.size()), ((aah)collection.iterator().next()).d() }), true);
/*     */     } else {
/* 166 */       ☃.a(new of(a1.a() + ".many.to.many.success", new Object[] { Integer.valueOf(collection1.size()), Integer.valueOf(collection.size()) }), true);
/*     */     } 
/*     */ 
/*     */     
/* 170 */     return i;
/*     */   }
/*     */   
/*     */   private static int a(db ☃, Collection<aah> collection, a a1, y y1, String str) {
/* 174 */     int i = 0;
/*     */     
/* 176 */     if (!y1.f().containsKey(str)) {
/* 177 */       throw new cz(new of("commands.advancement.criterionNotFound", new Object[] { y1.j(), str }));
/*     */     }
/*     */     
/* 180 */     for (aah aah : collection) {
/* 181 */       if (a1.a(aah, y1, str)) {
/* 182 */         i++;
/*     */       }
/*     */     } 
/*     */     
/* 186 */     if (i == 0) {
/* 187 */       if (collection.size() == 1) {
/* 188 */         throw new cz(new of(a1.a() + ".criterion.to.one.failure", new Object[] { str, y1.j(), ((aah)collection.iterator().next()).d() }));
/*     */       }
/* 190 */       throw new cz(new of(a1.a() + ".criterion.to.many.failure", new Object[] { str, y1.j(), Integer.valueOf(collection.size()) }));
/*     */     } 
/*     */ 
/*     */     
/* 194 */     if (collection.size() == 1) {
/* 195 */       ☃.a(new of(a1.a() + ".criterion.to.one.success", new Object[] { str, y1.j(), ((aah)collection.iterator().next()).d() }), true);
/*     */     } else {
/* 197 */       ☃.a(new of(a1.a() + ".criterion.to.many.success", new Object[] { str, y1.j(), Integer.valueOf(collection.size()) }), true);
/*     */     } 
/*     */     
/* 200 */     return i;
/*     */   }
/*     */   
/*     */   private static List<y> a(y ☃, b b1) {
/* 204 */     List<y> list = Lists.newArrayList();
/* 205 */     if (b.a(b1)) {
/* 206 */       y y1 = ☃.b();
/* 207 */       while (y1 != null) {
/* 208 */         list.add(y1);
/* 209 */         y1 = y1.b();
/*     */       } 
/*     */     } 
/* 212 */     list.add(☃);
/* 213 */     if (b.b(b1)) {
/* 214 */       a(☃, list);
/*     */     }
/* 216 */     return list;
/*     */   }
/*     */   
/*     */   private static void a(y ☃, List<y> list) {
/* 220 */     for (y y1 : ☃.e()) {
/* 221 */       list.add(y1);
/* 222 */       a(y1, list);
/*     */     } 
/*     */   }
/*     */   
/*     */   enum a {
/* 227 */     a("grant")
/*     */     {
/*     */       protected boolean a(aah ☃, y y1) {
/* 230 */         aa aa = ☃.J().b(y1);
/* 231 */         if (aa.a()) {
/* 232 */           return false;
/*     */         }
/* 234 */         for (String str : aa.e()) {
/* 235 */           ☃.J().a(y1, str);
/*     */         }
/* 237 */         return true;
/*     */       }
/*     */ 
/*     */       
/*     */       protected boolean a(aah ☃, y y1, String str) {
/* 242 */         return ☃.J().a(y1, str);
/*     */       }
/*     */     },
/* 245 */     b("revoke")
/*     */     {
/*     */       protected boolean a(aah ☃, y y1) {
/* 248 */         aa aa = ☃.J().b(y1);
/* 249 */         if (!aa.b()) {
/* 250 */           return false;
/*     */         }
/* 252 */         for (String str : aa.f()) {
/* 253 */           ☃.J().b(y1, str);
/*     */         }
/* 255 */         return true;
/*     */       }
/*     */ 
/*     */       
/*     */       protected boolean a(aah ☃, y y1, String str) {
/* 260 */         return ☃.J().b(y1, str);
/*     */       }
/*     */     };
/*     */ 
/*     */     
/*     */     private final String c;
/*     */     
/*     */     a(String ☃) {
/* 268 */       this.c = "commands.advancement." + ☃;
/*     */     }
/*     */     
/*     */     public int a(aah ☃, Iterable<y> iterable) {
/* 272 */       int i = 0;
/* 273 */       for (y y : iterable) {
/* 274 */         if (a(☃, y)) {
/* 275 */           i++;
/*     */         }
/*     */       } 
/* 278 */       return i;
/*     */     }
/*     */     
/*     */     protected abstract boolean a(aah param1aah, y param1y);
/*     */     
/*     */     protected abstract boolean a(aah param1aah, y param1y, String param1String);
/*     */     
/*     */     protected String a() {
/* 286 */       return this.c;
/*     */     }
/*     */   }
/*     */   
/*     */   enum b {
/* 291 */     a(false, false),
/* 292 */     b(true, true),
/* 293 */     c(false, true),
/* 294 */     d(true, false),
/* 295 */     e(true, true);
/*     */     
/*     */     private final boolean f;
/*     */     
/*     */     private final boolean g;
/*     */     
/*     */     b(boolean ☃, boolean bool1) {
/* 302 */       this.f = ☃;
/* 303 */       this.g = bool1;
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\wf.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */