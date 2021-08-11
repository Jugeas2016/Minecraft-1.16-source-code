/*     */ import com.google.common.collect.Maps;
/*     */ import com.google.common.collect.Sets;
/*     */ import com.google.gson.JsonArray;
/*     */ import com.google.gson.JsonElement;
/*     */ import com.google.gson.JsonObject;
/*     */ import com.mojang.brigadier.CommandDispatcher;
/*     */ import com.mojang.brigadier.arguments.ArgumentType;
/*     */ import com.mojang.brigadier.tree.ArgumentCommandNode;
/*     */ import com.mojang.brigadier.tree.CommandNode;
/*     */ import java.util.Collection;
/*     */ import java.util.Map;
/*     */ import java.util.Set;
/*     */ import javax.annotation.Nullable;
/*     */ import org.apache.logging.log4j.LogManager;
/*     */ import org.apache.logging.log4j.Logger;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class fk
/*     */ {
/*  65 */   private static final Logger a = LogManager.getLogger();
/*     */   
/*  67 */   private static final Map<Class<?>, a<?>> b = Maps.newHashMap();
/*  68 */   private static final Map<vk, a<?>> c = Maps.newHashMap();
/*     */   
/*     */   public static <T extends ArgumentType<?>> void a(String ☃, Class<T> clazz, fj<T> fj1) {
/*  71 */     vk vk = new vk(☃);
/*     */     
/*  73 */     if (b.containsKey(clazz)) {
/*  74 */       throw new IllegalArgumentException("Class " + clazz.getName() + " already has a serializer!");
/*     */     }
/*  76 */     if (c.containsKey(vk)) {
/*  77 */       throw new IllegalArgumentException("'" + vk + "' is already a registered serializer!");
/*     */     }
/*  79 */     a<T> a = new a<>(clazz, fj1, vk);
/*  80 */     b.put(clazz, a);
/*  81 */     c.put(vk, a);
/*     */   }
/*     */   
/*     */   public static void a() {
/*  85 */     fn.a();
/*  86 */     a("entity", dk.class, new dk.a());
/*  87 */     a("game_profile", dm.class, new fl<>(dm::a));
/*  88 */     a("block_pos", ek.class, new fl<>(ek::a));
/*  89 */     a("column_pos", el.class, new fl<>(el::a));
/*  90 */     a("vec3", er.class, new fl<>(er::a));
/*  91 */     a("vec2", eq.class, new fl<>(eq::a));
/*  92 */     a("block_state", eh.class, new fl<>(eh::a));
/*  93 */     a("block_predicate", eg.class, new fl<>(eg::a));
/*  94 */     a("item_stack", ew.class, new fl<>(ew::a));
/*  95 */     a("item_predicate", ez.class, new fl<>(ez::a));
/*  96 */     a("color", df.class, new fl<>(df::a));
/*  97 */     a("component", dg.class, new fl<>(dg::a));
/*  98 */     a("message", dp.class, new fl<>(dp::a));
/*  99 */     a("nbt_compound_tag", dh.class, new fl<>(dh::a));
/* 100 */     a("nbt_tag", ds.class, new fl<>(ds::a));
/* 101 */     a("nbt_path", dr.class, new fl<>(dr::a));
/* 102 */     a("objective", dt.class, new fl<>(dt::a));
/* 103 */     a("objective_criteria", du.class, new fl<>(du::a));
/* 104 */     a("operation", dv.class, new fl<>(dv::a));
/* 105 */     a("particle", dw.class, new fl<>(dw::a));
/* 106 */     a("angle", de.class, new fl<>(de::a));
/* 107 */     a("rotation", eo.class, new fl<>(eo::a));
/* 108 */     a("scoreboard_slot", ea.class, new fl<>(ea::a));
/* 109 */     a("score_holder", dz.class, new dz.c());
/* 110 */     a("swizzle", ep.class, new fl<>(ep::a));
/* 111 */     a("team", ec.class, new fl<>(ec::a));
/* 112 */     a("item_slot", eb.class, new fl<>(eb::a));
/* 113 */     a("resource_location", dy.class, new fl<>(dy::a));
/* 114 */     a("mob_effect", dq.class, new fl<>(dq::a));
/* 115 */     a("function", ev.class, new fl<>(ev::a));
/* 116 */     a("entity_anchor", dj.class, new fl<>(dj::a));
/* 117 */     a("int_range", dx.b.class, new fl<>(dx::a));
/* 118 */     a("float_range", dx.a.class, new fl<>(dx::b));
/* 119 */     a("item_enchantment", dn.class, new fl<>(dn::a));
/* 120 */     a("entity_summon", dl.class, new fl<>(dl::a));
/* 121 */     a("dimension", di.class, new fl<>(di::a));
/* 122 */     a("time", ed.class, new fl<>(ed::a));
/* 123 */     a("uuid", ee.class, new fl<>(ee::a));
/*     */     
/* 125 */     if (w.d) {
/* 126 */       a("test_argument", lv.class, new fl<>(lv::a));
/* 127 */       a("test_class", ls.class, new fl<>(ls::a));
/*     */     } 
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   private static a<?> a(vk ☃) {
/* 133 */     return c.get(☃);
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   private static a<?> b(ArgumentType<?> ☃) {
/* 138 */     return b.get(☃.getClass());
/*     */   }
/*     */ 
/*     */   
/*     */   public static <T extends ArgumentType<?>> void a(nf ☃, T t) {
/* 143 */     a<T> a = (a)b((ArgumentType<?>)t);
/* 144 */     if (a == null) {
/* 145 */       a.error("Could not serialize {} ({}) - will not be sent to client!", t, t.getClass());
/* 146 */       ☃.a(new vk(""));
/*     */       
/*     */       return;
/*     */     } 
/* 150 */     ☃.a(a.c);
/* 151 */     a.b.a(t, ☃);
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public static ArgumentType<?> a(nf ☃) {
/* 156 */     vk vk = ☃.p();
/* 157 */     a<?> a = a(vk);
/*     */     
/* 159 */     if (a == null) {
/* 160 */       a.error("Could not deserialize {}", vk);
/* 161 */       return null;
/*     */     } 
/*     */     
/* 164 */     return (ArgumentType<?>)a.b.b(☃);
/*     */   }
/*     */ 
/*     */   
/*     */   private static <T extends ArgumentType<?>> void a(JsonObject ☃, T t) {
/* 169 */     a<T> a = (a)b((ArgumentType<?>)t);
/* 170 */     if (a == null) {
/* 171 */       a.error("Could not serialize argument {} ({})!", t, t.getClass());
/* 172 */       ☃.addProperty("type", "unknown");
/*     */     } else {
/* 174 */       ☃.addProperty("type", "argument");
/* 175 */       ☃.addProperty("parser", a.c.toString());
/*     */       
/* 177 */       JsonObject jsonObject = new JsonObject();
/* 178 */       a.b.a(t, jsonObject);
/* 179 */       if (jsonObject.size() > 0) {
/* 180 */         ☃.add("properties", (JsonElement)jsonObject);
/*     */       }
/*     */     } 
/*     */   }
/*     */   
/*     */   public static <S> JsonObject a(CommandDispatcher<S> ☃, CommandNode<S> commandNode) {
/* 186 */     JsonObject jsonObject1 = new JsonObject();
/*     */     
/* 188 */     if (commandNode instanceof com.mojang.brigadier.tree.RootCommandNode) {
/* 189 */       jsonObject1.addProperty("type", "root");
/* 190 */     } else if (commandNode instanceof com.mojang.brigadier.tree.LiteralCommandNode) {
/* 191 */       jsonObject1.addProperty("type", "literal");
/* 192 */     } else if (commandNode instanceof ArgumentCommandNode) {
/* 193 */       a(jsonObject1, ((ArgumentCommandNode)commandNode).getType());
/*     */     } else {
/* 195 */       a.error("Could not serialize node {} ({})!", commandNode, commandNode.getClass());
/*     */       
/* 197 */       jsonObject1.addProperty("type", "unknown");
/*     */     } 
/*     */     
/* 200 */     JsonObject jsonObject2 = new JsonObject();
/* 201 */     for (CommandNode<S> commandNode1 : (Iterable<CommandNode<S>>)commandNode.getChildren()) {
/* 202 */       jsonObject2.add(commandNode1.getName(), (JsonElement)a(☃, commandNode1));
/*     */     }
/* 204 */     if (jsonObject2.size() > 0) {
/* 205 */       jsonObject1.add("children", (JsonElement)jsonObject2);
/*     */     }
/*     */     
/* 208 */     if (commandNode.getCommand() != null) {
/* 209 */       jsonObject1.addProperty("executable", Boolean.valueOf(true));
/*     */     }
/*     */     
/* 212 */     if (commandNode.getRedirect() != null) {
/* 213 */       Collection<String> collection = ☃.getPath(commandNode.getRedirect());
/* 214 */       if (!collection.isEmpty()) {
/* 215 */         JsonArray jsonArray = new JsonArray();
/* 216 */         for (String str : collection) {
/* 217 */           jsonArray.add(str);
/*     */         }
/* 219 */         jsonObject1.add("redirect", (JsonElement)jsonArray);
/*     */       } 
/*     */     } 
/*     */     
/* 223 */     return jsonObject1;
/*     */   }
/*     */   
/*     */   public static boolean a(ArgumentType<?> ☃) {
/* 227 */     return (b(☃) != null);
/*     */   }
/*     */   
/*     */   public static <T> Set<ArgumentType<?>> a(CommandNode<T> ☃) {
/* 231 */     Set<CommandNode<T>> set = Sets.newIdentityHashSet();
/* 232 */     Set<ArgumentType<?>> set1 = Sets.newHashSet();
/* 233 */     a(☃, set1, set);
/* 234 */     return set1;
/*     */   }
/*     */   
/*     */   private static <T> void a(CommandNode<T> ☃, Set<ArgumentType<?>> set, Set<CommandNode<T>> set1) {
/* 238 */     if (!set1.add(☃)) {
/*     */       return;
/*     */     }
/*     */     
/* 242 */     if (☃ instanceof ArgumentCommandNode) {
/* 243 */       set.add(((ArgumentCommandNode)☃).getType());
/*     */     }
/*     */     
/* 246 */     ☃.getChildren().forEach(commandNode -> a(commandNode, ☃, set));
/* 247 */     CommandNode<T> commandNode = ☃.getRedirect();
/* 248 */     if (commandNode != null)
/* 249 */       a(commandNode, set, set1); 
/*     */   }
/*     */   
/*     */   static class a<T extends ArgumentType<?>>
/*     */   {
/*     */     public final Class<T> a;
/*     */     public final fj<T> b;
/*     */     public final vk c;
/*     */     
/*     */     private a(Class<T> ☃, fj<T> fj1, vk vk1) {
/* 259 */       this.a = ☃;
/* 260 */       this.b = fj1;
/* 261 */       this.c = vk1;
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\fk.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */