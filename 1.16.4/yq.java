/*     */ import com.mojang.brigadier.CommandDispatcher;
/*     */ import com.mojang.brigadier.builder.LiteralArgumentBuilder;
/*     */ import com.mojang.brigadier.builder.RequiredArgumentBuilder;
/*     */ import com.mojang.brigadier.context.CommandContext;
/*     */ import com.mojang.brigadier.exceptions.CommandSyntaxException;
/*     */ import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
/*     */ import com.mojang.brigadier.tree.CommandNode;
/*     */ import com.mojang.brigadier.tree.LiteralCommandNode;
/*     */ import java.util.Collection;
/*     */ import java.util.Collections;
/*     */ import java.util.EnumSet;
/*     */ import java.util.Set;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class yq
/*     */ {
/*  49 */   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(new of("commands.teleport.invalidPosition"));
/*     */   
/*     */   public static void a(CommandDispatcher<db> ☃) {
/*  52 */     LiteralCommandNode<db> literalCommandNode = ☃.register(
/*  53 */         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)dc.a("teleport")
/*  54 */         .requires(☃ -> ☃.c(2)))
/*  55 */         .then((
/*  56 */           (RequiredArgumentBuilder)dc.<T>a("targets", dk.b())
/*  57 */           .then((
/*  58 */             (RequiredArgumentBuilder)((RequiredArgumentBuilder)dc.<T>a("location", er.a())
/*  59 */             .executes(☃ -> a((db)☃.getSource(), dk.b(☃, "targets"), ((db)☃.getSource()).e(), er.b(☃, "location"), null, null)))
/*  60 */             .then(
/*  61 */               dc.<T>a("rotation", eo.a())
/*  62 */               .executes(☃ -> a((db)☃.getSource(), dk.b(☃, "targets"), ((db)☃.getSource()).e(), er.b(☃, "location"), eo.a(☃, "rotation"), null))))
/*     */             
/*  64 */             .then((
/*  65 */               (LiteralArgumentBuilder)dc.a("facing")
/*  66 */               .then(
/*  67 */                 dc.a("entity")
/*  68 */                 .then((
/*  69 */                   (RequiredArgumentBuilder)dc.<T>a("facingEntity", dk.a())
/*  70 */                   .executes(☃ -> a((db)☃.getSource(), dk.b(☃, "targets"), ((db)☃.getSource()).e(), er.b(☃, "location"), null, new a(dk.a(☃, "facingEntity"), dj.a.a))))
/*  71 */                   .then(
/*  72 */                     dc.<T>a("facingAnchor", dj.a())
/*  73 */                     .executes(☃ -> a((db)☃.getSource(), dk.b(☃, "targets"), ((db)☃.getSource()).e(), er.b(☃, "location"), null, new a(dk.a(☃, "facingEntity"), dj.a(☃, "facingAnchor"))))))))
/*     */ 
/*     */ 
/*     */               
/*  77 */               .then(
/*  78 */                 dc.<T>a("facingLocation", er.a())
/*  79 */                 .executes(☃ -> a((db)☃.getSource(), dk.b(☃, "targets"), ((db)☃.getSource()).e(), er.b(☃, "location"), null, new a(er.a(☃, "facingLocation"))))))))
/*     */ 
/*     */ 
/*     */           
/*  83 */           .then(
/*  84 */             dc.<T>a("destination", dk.a())
/*  85 */             .executes(☃ -> a((db)☃.getSource(), dk.b(☃, "targets"), dk.a(☃, "destination"))))))
/*     */ 
/*     */         
/*  88 */         .then(
/*  89 */           dc.<T>a("location", er.a())
/*  90 */           .executes(☃ -> a((db)☃.getSource(), Collections.singleton(((db)☃.getSource()).g()), ((db)☃.getSource()).e(), er.b(☃, "location"), et.d(), null))))
/*     */         
/*  92 */         .then(
/*  93 */           dc.<T>a("destination", dk.a())
/*  94 */           .executes(☃ -> a((db)☃.getSource(), Collections.singleton(((db)☃.getSource()).g()), dk.a(☃, "destination")))));
/*     */ 
/*     */     
/*  97 */     ☃.register(
/*  98 */         (LiteralArgumentBuilder)((LiteralArgumentBuilder)dc.a("tp")
/*  99 */         .requires(☃ -> ☃.c(2)))
/* 100 */         .redirect((CommandNode)literalCommandNode));
/*     */   }
/*     */ 
/*     */   
/*     */   private static int a(db ☃, Collection<? extends aqa> collection, aqa aqa1) throws CommandSyntaxException {
/* 105 */     for (aqa aqa2 : collection) {
/* 106 */       a(☃, aqa2, (aag)aqa1.l, aqa1.cD(), aqa1.cE(), aqa1.cH(), EnumSet.noneOf(qk.a.class), aqa1.p, aqa1.q, null);
/*     */     }
/*     */     
/* 109 */     if (collection.size() == 1) {
/* 110 */       ☃.a(new of("commands.teleport.success.entity.single", new Object[] { ((aqa)collection.iterator().next()).d(), aqa1.d() }), true);
/*     */     } else {
/* 112 */       ☃.a(new of("commands.teleport.success.entity.multiple", new Object[] { Integer.valueOf(collection.size()), aqa1.d() }), true);
/*     */     } 
/*     */     
/* 115 */     return collection.size();
/*     */   }
/*     */   
/*     */   private static int a(db ☃, Collection<? extends aqa> collection, aag aag1, em em1, @Nullable em em2, @Nullable a a1) throws CommandSyntaxException {
/* 119 */     dcn dcn = em1.a(☃);
/* 120 */     dcm dcm = (em2 == null) ? null : em2.b(☃);
/* 121 */     Set<qk.a> set = EnumSet.noneOf(qk.a.class);
/*     */     
/* 123 */     if (em1.a()) {
/* 124 */       set.add(qk.a.a);
/*     */     }
/* 126 */     if (em1.b()) {
/* 127 */       set.add(qk.a.b);
/*     */     }
/* 129 */     if (em1.c()) {
/* 130 */       set.add(qk.a.c);
/*     */     }
/* 132 */     if (em2 == null) {
/* 133 */       set.add(qk.a.e);
/* 134 */       set.add(qk.a.d);
/*     */     } else {
/* 136 */       if (em2.a()) {
/* 137 */         set.add(qk.a.e);
/*     */       }
/* 139 */       if (em2.b()) {
/* 140 */         set.add(qk.a.d);
/*     */       }
/*     */     } 
/*     */     
/* 144 */     for (aqa aqa : collection) {
/* 145 */       if (em2 == null) {
/* 146 */         a(☃, aqa, aag1, dcn.b, dcn.c, dcn.d, set, aqa.p, aqa.q, a1); continue;
/*     */       } 
/* 148 */       a(☃, aqa, aag1, dcn.b, dcn.c, dcn.d, set, dcm.j, dcm.i, a1);
/*     */     } 
/*     */ 
/*     */     
/* 152 */     if (collection.size() == 1) {
/* 153 */       ☃.a(new of("commands.teleport.success.location.single", new Object[] { ((aqa)collection.iterator().next()).d(), Double.valueOf(dcn.b), Double.valueOf(dcn.c), Double.valueOf(dcn.d) }), true);
/*     */     } else {
/* 155 */       ☃.a(new of("commands.teleport.success.location.multiple", new Object[] { Integer.valueOf(collection.size()), Double.valueOf(dcn.b), Double.valueOf(dcn.c), Double.valueOf(dcn.d) }), true);
/*     */     } 
/*     */     
/* 158 */     return collection.size();
/*     */   }
/*     */   
/*     */   private static void a(db ☃, aqa aqa1, aag aag1, double d1, double d2, double d3, Set<qk.a> set, float f1, float f2, @Nullable a a1) throws CommandSyntaxException {
/* 162 */     fx fx = new fx(d1, d2, d3);
/* 163 */     if (!brx.l(fx)) {
/* 164 */       throw a.create();
/*     */     }
/*     */     
/* 167 */     if (aqa1 instanceof aah) {
/* 168 */       brd brd = new brd(new fx(d1, d2, d3));
/* 169 */       aag1.i().a(aal.g, brd, 1, Integer.valueOf(aqa1.Y()));
/* 170 */       aqa1.l();
/*     */       
/* 172 */       if (((aah)aqa1).em()) {
/* 173 */         ((aah)aqa1).a(true, true);
/*     */       }
/*     */       
/* 176 */       if (aag1 == aqa1.l) {
/* 177 */         ((aah)aqa1).b.a(d1, d2, d3, f1, f2, set);
/*     */       } else {
/* 179 */         ((aah)aqa1).a(aag1, d1, d2, d3, f1, f2);
/*     */       } 
/* 181 */       aqa1.m(f1);
/*     */     } else {
/* 183 */       float f3 = afm.g(f1);
/* 184 */       float f4 = afm.g(f2);
/*     */       
/* 186 */       f4 = afm.a(f4, -90.0F, 90.0F);
/*     */       
/* 188 */       if (aag1 == aqa1.l) {
/* 189 */         aqa1.b(d1, d2, d3, f3, f4);
/* 190 */         aqa1.m(f3);
/*     */       } else {
/* 192 */         aqa1.V();
/* 193 */         aqa aqa2 = aqa1;
/* 194 */         aqa1 = (aqa)aqa2.X().a(aag1);
/* 195 */         if (aqa1 != null) {
/* 196 */           aqa1.v(aqa2);
/* 197 */           aqa1.b(d1, d2, d3, f3, f4);
/* 198 */           aqa1.m(f3);
/* 199 */           aag1.e(aqa1);
/*     */           
/* 201 */           aqa2.y = true;
/*     */         } else {
/*     */           return;
/*     */         } 
/*     */       } 
/*     */     } 
/*     */     
/* 208 */     if (a1 != null) {
/* 209 */       a1.a(☃, aqa1);
/*     */     }
/*     */     
/* 212 */     if (!(aqa1 instanceof aqm) || !((aqm)aqa1).ef()) {
/* 213 */       aqa1.f(aqa1.cC().d(1.0D, 0.0D, 1.0D));
/* 214 */       aqa1.c(true);
/*     */     } 
/*     */     
/* 217 */     if (aqa1 instanceof aqu)
/* 218 */       ((aqu)aqa1).x().o(); 
/*     */   }
/*     */   
/*     */   static class a
/*     */   {
/*     */     private final dcn a;
/*     */     private final aqa b;
/*     */     private final dj.a c;
/*     */     
/*     */     public a(aqa ☃, dj.a a1) {
/* 228 */       this.b = ☃;
/* 229 */       this.c = a1;
/* 230 */       this.a = a1.a(☃);
/*     */     }
/*     */     
/*     */     public a(dcn ☃) {
/* 234 */       this.b = null;
/* 235 */       this.a = ☃;
/* 236 */       this.c = null;
/*     */     }
/*     */     
/*     */     public void a(db ☃, aqa aqa1) {
/* 240 */       if (this.b != null) {
/* 241 */         if (aqa1 instanceof aah) {
/* 242 */           ((aah)aqa1).a(☃.k(), this.b, this.c);
/*     */         } else {
/* 244 */           aqa1.a(☃.k(), this.a);
/*     */         } 
/*     */       } else {
/* 247 */         aqa1.a(☃.k(), this.a);
/*     */       } 
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\yq.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */