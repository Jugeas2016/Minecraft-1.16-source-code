/*     */ import com.google.common.collect.Maps;
/*     */ import com.mojang.brigadier.ImmutableStringReader;
/*     */ import com.mojang.brigadier.Message;
/*     */ import com.mojang.brigadier.StringReader;
/*     */ import com.mojang.brigadier.exceptions.CommandSyntaxException;
/*     */ import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
/*     */ import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
/*     */ import com.mojang.brigadier.suggestion.SuggestionsBuilder;
/*     */ import java.util.Arrays;
/*     */ import java.util.List;
/*     */ import java.util.Locale;
/*     */ import java.util.Map;
/*     */ import java.util.Objects;
/*     */ import java.util.concurrent.CompletableFuture;
/*     */ import java.util.function.BiConsumer;
/*     */ import java.util.function.Consumer;
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
/*     */ public class fe
/*     */ {
/*  53 */   private static final Map<String, b> i = Maps.newHashMap(); public static final DynamicCommandExceptionType a; public static final DynamicCommandExceptionType b;
/*     */   static {
/*  55 */     a = new DynamicCommandExceptionType(☃ -> new of("argument.entity.options.unknown", new Object[] { ☃ }));
/*  56 */     b = new DynamicCommandExceptionType(☃ -> new of("argument.entity.options.inapplicable", new Object[] { ☃ }));
/*  57 */   } public static final SimpleCommandExceptionType c = new SimpleCommandExceptionType(new of("argument.entity.options.distance.negative"));
/*  58 */   public static final SimpleCommandExceptionType d = new SimpleCommandExceptionType(new of("argument.entity.options.level.negative"));
/*  59 */   public static final SimpleCommandExceptionType e = new SimpleCommandExceptionType(new of("argument.entity.options.limit.toosmall")); public static final DynamicCommandExceptionType f; public static final DynamicCommandExceptionType g; public static final DynamicCommandExceptionType h; static {
/*  60 */     f = new DynamicCommandExceptionType(☃ -> new of("argument.entity.options.sort.irreversible", new Object[] { ☃ }));
/*  61 */     g = new DynamicCommandExceptionType(☃ -> new of("argument.entity.options.mode.invalid", new Object[] { ☃ }));
/*  62 */     h = new DynamicCommandExceptionType(☃ -> new of("argument.entity.options.type.invalid", new Object[] { ☃ }));
/*     */   }
/*     */   private static void a(String ☃, a a1, Predicate<fd> predicate, nr nr1) {
/*  65 */     i.put(☃, new b(a1, predicate, nr1));
/*     */   }
/*     */   
/*     */   public static void a() {
/*  69 */     if (!i.isEmpty()) {
/*     */       return;
/*     */     }
/*     */     
/*  73 */     a("name", ☃ -> { int i = ☃.g().getCursor(); boolean bool = ☃.e(); String str = ☃.g().readString(); if (☃.w() && !bool) { ☃.g().setCursor(i); throw b.createWithContext(☃.g(), "name"); }  if (bool) { ☃.c(true); } else { ☃.b(true); }  ☃.a(()); }☃ -> !☃.v(), new of("argument.entity.options.name.description"));
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
/*  89 */     a("distance", ☃ -> { int i = ☃.g().getCursor(); bz.c c = bz.c.a(☃.g()); if ((c.a() != null && c.a().floatValue() < 0.0F) || (c.b() != null && c.b().floatValue() < 0.0F)) { ☃.g().setCursor(i); throw c.createWithContext(☃.g()); }  ☃.a(c); ☃.h(); }☃ -> ☃.i().c(), new of("argument.entity.options.distance.description"));
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
/* 100 */     a("level", ☃ -> { int i = ☃.g().getCursor(); bz.d d = bz.d.a(☃.g()); if ((d.a() != null && d.a().intValue() < 0) || (d.b() != null && d.b().intValue() < 0)) { ☃.g().setCursor(i); throw d.createWithContext(☃.g()); }  ☃.a(d); ☃.a(false); }☃ -> ☃.j().c(), new of("argument.entity.options.level.description"));
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
/* 111 */     a("x", ☃ -> { ☃.h(); ☃.a(☃.g().readDouble()); }☃ -> (☃.m() == null), new of("argument.entity.options.x.description"));
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 116 */     a("y", ☃ -> { ☃.h(); ☃.b(☃.g().readDouble()); }☃ -> (☃.n() == null), new of("argument.entity.options.y.description"));
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 121 */     a("z", ☃ -> { ☃.h(); ☃.c(☃.g().readDouble()); }☃ -> (☃.o() == null), new of("argument.entity.options.z.description"));
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 126 */     a("dx", ☃ -> { ☃.h(); ☃.d(☃.g().readDouble()); }☃ -> (☃.p() == null), new of("argument.entity.options.dx.description"));
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 131 */     a("dy", ☃ -> { ☃.h(); ☃.e(☃.g().readDouble()); }☃ -> (☃.q() == null), new of("argument.entity.options.dy.description"));
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 136 */     a("dz", ☃ -> { ☃.h(); ☃.f(☃.g().readDouble()); }☃ -> (☃.r() == null), new of("argument.entity.options.dz.description"));
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 141 */     a("x_rotation", ☃ -> ☃.a(cu.a(☃.g(), true, afm::g)), ☃ -> (☃.k() == cu.a), new of("argument.entity.options.x_rotation.description"));
/*     */ 
/*     */ 
/*     */     
/* 145 */     a("y_rotation", ☃ -> ☃.b(cu.a(☃.g(), true, afm::g)), ☃ -> (☃.l() == cu.a), new of("argument.entity.options.y_rotation.description"));
/*     */ 
/*     */ 
/*     */     
/* 149 */     a("limit", ☃ -> {
/*     */           int i = ☃.g().getCursor();
/*     */           int j = ☃.g().readInt();
/*     */           if (j < 1) {
/*     */             ☃.g().setCursor(i);
/*     */             throw e.createWithContext(☃.g());
/*     */           } 
/*     */           ☃.a(j);
/*     */           ☃.d(true);
/* 158 */         }☃ -> (!☃.u() && !☃.x()), new of("argument.entity.options.limit.description"));
/*     */     
/* 160 */     a("sort", ☃ -> {
/*     */           BiConsumer<dcn, List<? extends aqa>> biConsumer;
/*     */           int i = ☃.g().getCursor();
/*     */           String str = ☃.g().readUnquotedString();
/*     */           ☃.a(());
/*     */           switch (str) {
/*     */             case "nearest":
/*     */               biConsumer = fd.h;
/*     */               break;
/*     */             case "furthest":
/*     */               biConsumer = fd.i;
/*     */               break;
/*     */             case "random":
/*     */               biConsumer = fd.j;
/*     */               break;
/*     */             case "arbitrary":
/*     */               biConsumer = fd.g;
/*     */               break;
/*     */             default:
/*     */               ☃.g().setCursor(i);
/*     */               throw f.createWithContext(☃.g(), str);
/*     */           } 
/*     */           ☃.a(biConsumer);
/*     */           ☃.e(true);
/* 184 */         }☃ -> (!☃.u() && !☃.y()), new of("argument.entity.options.sort.description"));
/*     */     
/* 186 */     a("gamemode", ☃ -> { ☃.a(()); int i = ☃.g().getCursor(); boolean bool = ☃.e(); if (☃.A() && !bool) { ☃.g().setCursor(i); throw b.createWithContext(☃.g(), "gamemode"); }  String str = ☃.g().readUnquotedString(); bru bru = bru.a(str, bru.a); if (bru == bru.a) { ☃.g().setCursor(i); throw g.createWithContext(☃.g(), str); }  ☃.a(false); ☃.a(()); if (bool) { ☃.g(true); } else { ☃.f(true); }  }☃ -> !☃.z(), new of("argument.entity.options.gamemode.description"));
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 242 */     a("team", ☃ -> { boolean bool = ☃.e(); String str = ☃.g().readUnquotedString(); ☃.a(()); if (bool) { ☃.i(true); } else { ☃.h(true); }  }☃ -> !☃.B(), new of("argument.entity.options.team.description"));
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
/* 261 */     a("type", ☃ -> { ☃.a(()); int i = ☃.g().getCursor(); boolean bool = ☃.e(); if (☃.F() && !bool) { ☃.g().setCursor(i); throw b.createWithContext(☃.g(), "type"); }  if (bool) ☃.D();  if (☃.f()) { vk vk = vk.a(☃.g()); ☃.a(()); } else { vk vk = vk.a(☃.g()); aqe<?> aqe = (aqe)gm.S.b(vk).orElseThrow(()); if (Objects.equals(aqe.bc, aqe) && !bool) ☃.a(false);  ☃.a(()); if (!bool) ☃.a(aqe);  }  }☃ -> !☃.E(), new of("argument.entity.options.type.description"));
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
/* 302 */     a("tag", ☃ -> { boolean bool = ☃.e(); String str = ☃.g().readUnquotedString(); ☃.a(()); }☃ -> true, new of("argument.entity.options.tag.description"));
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
/* 315 */     a("nbt", ☃ -> { boolean bool = ☃.e(); md md = (new mu(☃.g())).f(); ☃.a(()); }☃ -> true, new of("argument.entity.options.nbt.description"));
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
/* 331 */     a("scores", ☃ -> { StringReader stringReader = ☃.g(); Map<String, bz.d> map = Maps.newHashMap(); stringReader.expect('{'); stringReader.skipWhitespace(); while (stringReader.canRead() && stringReader.peek() != '}') { stringReader.skipWhitespace(); String str = stringReader.readUnquotedString(); stringReader.skipWhitespace(); stringReader.expect('='); stringReader.skipWhitespace(); bz.d d = bz.d.a(stringReader); map.put(str, d); stringReader.skipWhitespace(); if (stringReader.canRead() && stringReader.peek() == ',') stringReader.skip();  }  stringReader.expect('}'); if (!map.isEmpty()) ☃.a(());  ☃.j(true); }☃ -> !☃.G(), new of("argument.entity.options.scores.description"));
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
/* 377 */     a("advancements", ☃ -> { StringReader stringReader = ☃.g(); Map<vk, Predicate<aa>> map = Maps.newHashMap(); stringReader.expect('{'); stringReader.skipWhitespace(); while (stringReader.canRead() && stringReader.peek() != '}') { stringReader.skipWhitespace(); vk vk = vk.a(stringReader); stringReader.skipWhitespace(); stringReader.expect('='); stringReader.skipWhitespace(); if (stringReader.canRead() && stringReader.peek() == '{') { Map<String, Predicate<ae>> map1 = Maps.newHashMap(); stringReader.skipWhitespace(); stringReader.expect('{'); stringReader.skipWhitespace(); while (stringReader.canRead() && stringReader.peek() != '}') { stringReader.skipWhitespace(); String str = stringReader.readUnquotedString(); stringReader.skipWhitespace(); stringReader.expect('='); stringReader.skipWhitespace(); boolean bool = stringReader.readBoolean(); map1.put(str, ()); stringReader.skipWhitespace(); if (stringReader.canRead() && stringReader.peek() == ',') stringReader.skip();  }  stringReader.skipWhitespace(); stringReader.expect('}'); stringReader.skipWhitespace(); map.put(vk, ()); } else { boolean bool = stringReader.readBoolean(); map.put(vk, ()); }  stringReader.skipWhitespace(); if (stringReader.canRead() && stringReader.peek() == ',') stringReader.skip();  }  stringReader.expect('}'); if (!map.isEmpty()) { ☃.a(()); ☃.a(false); }  ☃.k(true); }☃ -> !☃.H(), new of("argument.entity.options.advancements.description"));
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
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 457 */     a("predicate", ☃ -> { boolean bool = ☃.e(); vk vk = vk.a(☃.g()); ☃.a(()); }☃ -> true, new of("argument.entity.options.predicate.description"));
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static a a(fd ☃, String str, int i) throws CommandSyntaxException {
/* 480 */     b b = i.get(str);
/* 481 */     if (b != null) {
/* 482 */       if (b.b.test(☃)) {
/* 483 */         return b.a;
/*     */       }
/* 485 */       throw b.createWithContext(☃.g(), str);
/*     */     } 
/*     */     
/* 488 */     ☃.g().setCursor(i);
/* 489 */     throw a.createWithContext(☃.g(), str);
/*     */   }
/*     */ 
/*     */   
/*     */   public static void a(fd ☃, SuggestionsBuilder suggestionsBuilder) {
/* 494 */     String str = suggestionsBuilder.getRemaining().toLowerCase(Locale.ROOT);
/* 495 */     for (Map.Entry<String, b> entry : i.entrySet()) {
/* 496 */       if (((b)entry.getValue()).b.test(☃) && ((String)entry.getKey()).toLowerCase(Locale.ROOT).startsWith(str)) {
/* 497 */         suggestionsBuilder.suggest((String)entry.getKey() + '=', ((b)entry.getValue()).c);
/*     */       }
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   static class b
/*     */   {
/*     */     public final fe.a a;
/*     */     
/*     */     public final Predicate<fd> b;
/*     */     
/*     */     public final nr c;
/*     */     
/*     */     private b(fe.a ☃, Predicate<fd> predicate, nr nr1) {
/* 512 */       this.a = ☃;
/* 513 */       this.b = predicate;
/* 514 */       this.c = nr1;
/*     */     }
/*     */   }
/*     */   
/*     */   public static interface a {
/*     */     void handle(fd param1fd) throws CommandSyntaxException;
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\fe.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */